package com.school140.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import jdk.internal.icu.text.UnicodeSet;
import jdk.jpackage.internal.Log;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Screen {
    String nameNewBookButton;
    static Skin skinTree;
    Array<String> charOfClassArray = new Array<>();
    static String descriptionString;
    static Stage stage;
    ScrollPane allBookScrollPane;
    ScrollPane descriptionScrollPane;
    static Table descriptionInfoTable = new Table();
    boolean coverReal;
    List allBookList;
    List allReaderList;
    String reportName;
    SelectBox reportYearsName;
    SelectBox reportCharName;
    SelectBox reportNameName;
    static public int bookNumber;
    static public int bookNumberOfHend;
    Table redactBook = new Table();
    TextField bookAuthorRedact;
    TextField bookNameRedact;
    TextField bookDescriptionRedact;
    TextField bookCoverRedact;
    SelectBox bookGenreRedact;
    TextButton report;
    TextField reportString;
    TextButton reportAll;
    TextButton reportGivReturn;
    TextButton reportNull;
    TextButton reportOnName;
    GregorianCalendar dataOfNewClass;
    // TODO: 20.09.2021  не пиратьте пожалуйста
    static GregorianCalendar nowData;
    static int index = -1;
    Table mainMenuTable = new Table();
    static Table numberAllBookTable = new Table();
    static TextField numberAllBook;
    static Table infoMenuTable = new Table();
    Table allBookScrollPaneTable = new Table();
    Table tableListAllBook = new Table();
    Table bookOnGivMenuTable = new Table();
    Table readersOnGivMenuTable = new Table();
    Table tableListAllReader = new Table();
    Table newBookTable = new Table();
    Table addNewBookTable = new Table();
    Table newReaderTable = new Table();
    Table returnMenuTable = new Table();
    Table descriptionTable = new Table();
    Table bookOnReaderTable = new Table();
    TextButton newBookAdded;
    static TextButton newBook;
    TextButton newReader;
    boolean noNullPointerException = true;


    boolean noError = true;
    TextButton giveBook;
    TextButton returnBook;
    TextButton dolg;
    TextButton allBook;
    TextButton myBook;
    TextButton onHands;
    TextButton readers;
    Array<String> textFieldBooks = new Array<>();
    int bookMenuTipNow = 0;
    static Label error;
    static int numberOfBook;
    static TextField nameBook;
    static int infoMenuTip = 1;
    static boolean authorAdded;
    Boolean reportOnNameOn = false;
    static TextField authorWindow;
    static TextField nameBookWindow;
    static TextField numberWindow;
    static Texture imageWindow;
    static TextField genreWindow;

    static int bookOnHendNumberInt = 0;

    int numberThisBook = 0;
    static TextField readerNumber;
    static TextField bookOnHendNumber;
    static TextField bookOnLibrary;
    static TextField readerNumberPreName;
    static TextField bookOnHendNumberPreName;
    static TextField bookOnLibraryPreName;
    static TextField bookOAllPreName;
    static Label descriptionWindow;
    static boolean nameAdded = false;
    TextField erorTextField;
    static Table infoMenu2Table = new Table();
    Array<String> readerBookArrey = new Array<>();
    Table errorDelTable = new Table();
    Label errorDelLabel;
    static SelectBox genreOfBookOnGivMenuSelectBox;
    static SelectBox bookOnReturnMenuSelectBox;
    static SelectBox authorOfBookOnGivMenuSelectBox;
    static SelectBox nameOfBookOnGivMenuSelectBox;
    static SelectBox classOfReadersOnGivMenuSelectBox;
    static SelectBox surnameOfReadersOnGivMenuSelectBox;
    static SelectBox classOfReadersOnReturnMenuSelectBox;
    static SelectBox surnameOfReadersOnReturnMenuSelectBox;
    static SelectBox charClassGivMenu;
    static SelectBox charClassReturnMenu;
    static TextField charClass;
    Table searchMenuBookTable = new Table();
    static SelectBox genreSearch;
    SelectBox authorSearch;
    TextField nameBookSearch;
    Table searchMenuReaderTable = new Table();
    SelectBox yearsSearch;
    SelectBox yearsCharSearch;
    TextField nameReaderSearch;
    TextField surnameReaderSearch;

    static Table giveBookButtonTable = new Table();
    static TextButton giveBookButton;
    TextButton deleteButton;
    Table deleteTable = new Table();
    static Boolean chooseObject = false;
    static ArrayList<String> authorOfBookOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> nameOfBookOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> surnameOfReadersOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> bookReturnArrayList = new ArrayList<>();
    TextButton returnBookButton;
    Table readerThisBookTable = new Table();
    SelectBox dolgBook;
    Table dolgBookTable = new Table();
    static TextField nameReaderWindowPreName;
    static TextField surnameReaderWindowPreName;
    static TextField numberBookOfHendWindowPreName;
    static TextField numberBookOfHendWindow;
    static TextField patronymicReaderWindowPreName;
    static TextField nameReaderWindow;
    static TextField surnameReaderWindow;
    static TextField patronymicReaderWindow;
    static TextField classReaderWindow;
    static boolean bookExclusive;
    static TextField classReaderWindowPreName;
    static TextField authorWindowPreName;
    static TextField nameBookWindowPreName;
    static TextField numberWindowPreName;
    static TextField genreWindowPreName;
    TextField errorNewReader;
    TextField nameReader;
    TextField surnameReader;
    TextField patronymicReader;
    SelectBox classReader;
    SelectBox readerThisBook;
    SelectBox bookThisReader;
    TextField readerThisBookPreName;
    TextField bookThisReaderPreName;
    TextButton addNewReader;
    TextField author;
    TextField number;
    Array<String> authorForSerch = new Array();
    Array<String> yearsForSerch = new Array();
    Array<String> charForSerch = new Array();
    Array<String> dolgArrayList = new Array();
    TextField pathToImage;
    TextButton exit;
    SelectBox genre;
    TextField numberBookRedact;
    Table delReportTable = new Table();
    TextField delReportText;
    TextButton delReportYes;
    TextButton delReportNo;
    String redactSave;
    TextButton redactBookButton;
    TextButton redactButton;
    TextField description;
    TextButton bookAdded;
    static Skin skin;
    Table reportTable = new Table();
    Table allALLBookScrollPaneTable = new Table();
    Table allALLBookOnHandScrollPaneTable = new Table();
    Table allALLBookOnLibraryScrollPaneTable = new Table();
    static String coverBook;
    static ArrayList<Book> bookArrayList = new ArrayList<>();
    static ArrayList<Readers> readersArrayList = new ArrayList<>();
    Table allReaderScrollPaneTable = new Table();
    ScrollPane allReaderScrollPane;
    TextButton newReaderAdded;
    boolean haveBoolean;
    Table descriptionWindowTable2;
    static int genre1 = 0;
    static int genre2 = 0;
    static int genre3 = 0;
    static int genre4 = 0;
    static int genre5 = 0;
    TextButton saveButton;
    int numberRedactMinusBook = 0;
    Table readersOnReportMenuTable = new Table();

    public Screen() {

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

        skinTree = new Skin(Gdx.files.internal("TreeButton/TreeButton2.json"));
        skin = new Skin(Gdx.files.internal("default/skin/uiskin.json"));


        meinMenu();
        allBookMenu();
        allReaderMenu();
        newBookMenu();
        newReaderMenu();
        giveBookMenu();
        returnBookMenu();
        infoMenu();
        redactMenu();
        newSerchMenu();
        stage.addActor(mainMenuTable);

        allALLBookScrollPaneTable = tableListAllBook;

    }


    private void redactMenu() {
        redactBook.setFillParent(true);
        numberBookRedact = new TextField("", skinTree);
        numberBookRedact.getStyle().background.setLeftWidth(5);
        numberBookRedact.getStyle().background.setRightWidth(5);
        redactBookButton = new TextButton("отредактировать", skinTree);
        bookAuthorRedact = new TextField("", skinTree);
        bookNameRedact = new TextField("", skinTree);
        bookDescriptionRedact = new TextField("", skinTree);
        bookCoverRedact = new TextField("", skinTree);
        bookGenreRedact = new SelectBox(skinTree);
        bookGenreRedact.setItems(" Неопределенный жанр", " Учебники", " Классика", " Детская литература", " Справочная литература", " Зарубежная литература");

        redactBook.add(bookAuthorRedact).pad(2).fill(1.1f, 1).row();
        redactBook.add(bookNameRedact).pad(2).fill(1.1f, 1).row();
        redactBook.add(bookGenreRedact).pad(2).fill(1.1f, 1).row();
        redactBook.add(bookDescriptionRedact).pad(2).fill(1.1f, 1).row();
        redactBook.add(bookCoverRedact).pad(2).fill(1.1f, 1).row();
        redactBook.add(numberBookRedact).pad(2).fill(1.1f, 1).row();
        redactBook.add(redactBookButton).pad(2).fill(1.1f, 1).row();


        redactBookButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                redactSave = bookArrayList.get(index).name + bookArrayList.get(index).author + bookArrayList.get(index).genre;

                if (numberThisBook < Integer.parseInt(numberBookRedact.getText())) {
                    descriptionString = "";
                    for (int i = 1; i < bookDescriptionRedact.getText().length() + 1; i++) {
                        descriptionString += bookDescriptionRedact.getText().charAt(i - 1);

                        if ((i % 25 / 16 > 0) && ((String.valueOf(bookDescriptionRedact.getText().charAt(i - 1))).equals(" "))) {
                            descriptionString += "\n";
                        }
                    }
                    for (int i = 0; i < Integer.parseInt(numberBookRedact.getText()) - numberThisBook; i++) {
                        bookArrayList.add(new Book((String) bookNameRedact.getText(), bookAuthorRedact.getText(),
                                String.valueOf(bookGenreRedact.getSelected()), descriptionString, bookCoverRedact.getText()));

                    }

                } else if (numberThisBook > Integer.parseInt(numberBookRedact.getText())) {
                    numberRedactMinusBook = 0;

                    for (int i = 0; i < bookArrayList.size() - numberRedactMinusBook; i++) {
                        if (redactSave.equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {
                            if (numberThisBook - Integer.parseInt(numberBookRedact.getText()) - numberRedactMinusBook != 0) {
                                bookArrayList.remove(i);
                                numberRedactMinusBook++;
                                i--;


                            }


                        }
                    }

                }

                coverReal = true;
                try {
                    if (!bookCoverRedact.getText().equals("noimg.png")) {
                        if (Gdx.files.absolute(bookCoverRedact.getText()).exists()) {
                            Gdx.files.absolute(bookCoverRedact.getText()).copyTo(Gdx.files.external("/.prefs/Library/cover/" + bookNameRedact.getText() + bookAuthorRedact.getText() + ".png"));
                        } else {
                            if (Gdx.files.internal(bookCoverRedact.getText()).exists()) {
                                Gdx.files.internal(bookCoverRedact.getText()).copyTo(Gdx.files.external("/.prefs/Library/cover/" + bookNameRedact.getText() + bookAuthorRedact.getText() + ".png"));
                            }
                        }
                    }


                } catch (NumberFormatException e) {
                    coverReal = false;
                }
                for (Book book : bookArrayList) {


                    if (redactSave.equals(book.name + book.author + book.genre)) {
                        book.author = bookAuthorRedact.getText();
                        book.name = bookNameRedact.getText();
                        book.genre = String.valueOf(bookGenreRedact.getSelected());
                        descriptionString = "";
                        for (int i = 1; i < bookDescriptionRedact.getText().length() + 1; i++) {
                            descriptionString += bookDescriptionRedact.getText().charAt(i - 1);

                            if ((i % 25 / 16 > 0) && ((String.valueOf(bookDescriptionRedact.getText().charAt(i - 1))).equals(" "))) {
                                descriptionString += "\n";
                            }
                        }
                        book.description = descriptionString;

                        if (coverReal) {
                            if (!bookCoverRedact.getText().equals("noimg.png")) {
                                book.coverBook = "/.prefs/Library/cover/" + bookNameRedact.getText() + bookAuthorRedact.getText() + ".png";
                            } else book.coverBook = "noimg.png";
                        }
                    }
                }


                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
                stage.addActor(readerThisBookTable);
                descriptionWindow.setText("Описание");
                stage.addActor(descriptionInfoTable);
                stage.addActor(infoMenuTable);
                infoMenuTip = 1;
                stage.addActor(deleteTable);
                meinMenuUsed();
                getAuthorForSearch();
                bookMenuTipNow = 0;
                stage.addActor(searchMenuBookTable);
                deleteTable.clear();
                deleteTable.setPosition(740, 180);
                deleteTable.add(redactButton).pad(2).row();
                deleteTable.add(deleteButton);
                allBookListUpdate();
                allALLBookScrollPaneTable = tableListAllBook;
            }
        });


    }

    void newSerchMenu() {

        searchMenuBookTable.setPosition(310, 620);
        genreSearch = new SelectBox(skinTree);
        genreSearch.setItems(" Неопределенный жанр", " Учебники[" + genre1 + "]", " Классика[" + genre2 + "]", " Детская литература[" + genre3 + "]", " Справочная литература[" + genre4 + "]", " Зарубежная литература[" + genre5 + "]");
        genreSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (bookMenuTipNow == 0) {
                    allBookListUpdate();
                }
                if (bookMenuTipNow == 1) {
                    allBookOnHendListUpdate();
                }
                if (bookMenuTipNow == 2) {
                    allBookOnMyHendListUpdate();
                }
                getAuthorForSearch();
                authorSearch.setItems(authorForSerch);
            }
        });
        authorSearch = new SelectBox(skinTree);
        getAuthorForSearch();

        authorSearch.setItems(authorForSerch);
        nameBookSearch = new TextField("", skinTree);
        nameBookSearch.setMessageText(" Поиск по названию");
        authorSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (bookMenuTipNow == 0) {
                    allBookListUpdate();
                }
                if (bookMenuTipNow == 1) {
                    allBookOnHendListUpdate();
                }
                if (bookMenuTipNow == 2) {
                    allBookOnMyHendListUpdate();
                }
            }
        });
        nameBookSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (bookMenuTipNow == 0) {
                    allBookListUpdate();
                }
                if (bookMenuTipNow == 1) {
                    allBookOnHendListUpdate();
                }
                if (bookMenuTipNow == 2) {
                    allBookOnMyHendListUpdate();
                }
                getAuthorForSearch();
                authorSearch.setItems(authorForSerch);
            }
        });

        searchMenuBookTable.add(genreSearch).pad(2);
        searchMenuBookTable.add(authorSearch).pad(2).size(150, 50);
        searchMenuBookTable.add(nameBookSearch).pad(2);
        stage.addActor(searchMenuBookTable);


        nameReaderSearch = new TextField("", skinTree);
        nameReaderSearch.setMessageText(" Поиск по имени");
        surnameReaderSearch = new TextField("", skinTree);
        surnameReaderSearch.setMessageText(" Поиск по фамилии");
        yearsSearch = new SelectBox(skinTree);
        yearsCharSearch = new SelectBox(skinTree);
        nameReaderSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                allReaderListUpdate();
                getCharForSerch();
                getYearsForSerch();
            }
        });
        surnameReaderSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                allReaderListUpdate();
                getCharForSerch();
                getYearsForSerch();
            }
        });
        yearsSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                allReaderListUpdate();
                getCharForSerch();
            }
        });
        yearsCharSearch.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                allReaderListUpdate();
                getYearsForSerch();
            }
        });

        searchMenuReaderTable = new Table();
        searchMenuReaderTable.setPosition(400, 620);
        searchMenuReaderTable.add(surnameReaderSearch).pad(2, 40, 2, 2).fill(1.5f, 1);
        ;
        searchMenuReaderTable.add(nameReaderSearch).pad(2, 78, 2, 2).fill(1.5f, 1);
        ;
        searchMenuReaderTable.add(yearsSearch).pad(2, 40, 2, 2);
        searchMenuReaderTable.add(yearsCharSearch).pad(2, 2, 2, 2);

        getAuthorForSearch();
    }

    public void getYearsForSerch() {
        yearsForSerch.clear();
        yearsForSerch.add(" Все классы");
        for (Readers reader : readersArrayList) {
            if (
                    ((reader.name.contains(nameReaderSearch.getText())) || (nameReaderSearch.getText().equals(""))) &&
                            ((reader.surname.contains(surnameReaderSearch.getText())) || (surnameReaderSearch.getText().equals(""))) &&
                            ((reader.charClass.equals(yearsCharSearch.getSelected())) || (yearsCharSearch.getSelectedIndex() == 0))
            ) {
                if (reader.yearsLern < 12) {
                    if (!yearsForSerch.contains(reader.yearsLern + " класс", false)) {
                        yearsForSerch.add(reader.yearsLern + " класс");
                    }
                } else if (!yearsForSerch.contains(" Сотрудники", false)) {
                    yearsForSerch.add(" Сотрудники");
                }
            }
        }
        yearsForSerch.sort();
        yearsForSerch.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o2.equals(" Все классы")) {
                    return 1;
                } else {
                    return (o1.length() - (o2.length()));
                }
            }
        });

        yearsSearch.setItems(yearsForSerch);
    }

    public void getCharForSerch() {

        charForSerch.clear();
        charForSerch.add(" Все буквы");
        for (Readers reader : readersArrayList) {
            if (
                    ((reader.name.contains(nameReaderSearch.getText())) || (nameReaderSearch.getText().equals(""))) &&
                            ((reader.surname.contains(surnameReaderSearch.getText())) || (surnameReaderSearch.getText().equals(""))) &&
                            ((reader.yearsLern == yearsSearch.getSelectedIndex() + 1) || (yearsSearch.getSelectedIndex() == 0))
            ) {
                if (!charForSerch.contains(reader.charClass, false)) {
                    charForSerch.add(reader.charClass);
                }
            }
        }
        yearsCharSearch.setItems(charForSerch);
    }

    void getAuthorForSearch() {
        authorForSerch.clear();
        authorForSerch.add(" Все авторы");
        for (Book book : bookArrayList) {

            if ((nameBookSearch.equals("")) || (nameBookSearch.equals(null))) {
                if (genreSearch.getSelectedIndex() == 0) {
                    if (!authorForSerch.contains(book.author, false)) {
                        authorForSerch.add(book.author);
                    }
                } else {
                    if ((!authorForSerch.contains(book.author, false)) && (genreSearch.getSelected().equals(book.genre))) {
                        authorForSerch.add(book.author);
                    }
                }
            } else if (book.name.contains(nameBookSearch.getText())) {

                if (genreSearch.getSelectedIndex() == 0) {
                    if (!authorForSerch.contains(book.author, false)) {
                        authorForSerch.add(book.author);
                    }
                } else {
                    if ((!authorForSerch.contains(book.author, false)) && (genreSearch.getSelected().equals(book.genre))) {
                        authorForSerch.add(book.author);
                    }
                }
            }


        }
    }

    public static void imgRender(SpriteBatch batch) {
        if (chooseObject) {
            if ((infoMenuTip == 1) || (infoMenuTip == 3)) {
                if ((Gdx.graphics.getHeight() == 768) || (Gdx.graphics.getWidth() == 1366)) {
                    batch.draw(imageWindow, (Gdx.graphics.getWidth()) / 2 - 200, Gdx.graphics.getHeight() / 2 - (int) (0.7 * newBook.getHeight()),
                            Gdx.graphics.getWidth() / 12, (int) (Gdx.graphics.getWidth() / 12 * Math.sqrt(2)));

                }


            }

        }
    }


    private void infoMenu() {
        dolgBook = new SelectBox(skinTree);
        dolgBookTable.setPosition(Gdx.graphics.getWidth(), 500);
        dolgBookTable.add(dolgBook).size(150, 50).fillX();

        deleteTable.setPosition(740, 180);


        deleteButton = new TextButton("Удалить", skinTree);
        errorDelLabel = new Label("все книги выданы", skin, "red");

        errorDelTable.setPosition(830, 130);
        errorDelTable.addActor(errorDelLabel);


        deleteButton.addListener(new ChangeListener() {

            @Override
            public void changed(ChangeEvent event, Actor actor) {

                if (chooseObject) {
                    if (infoMenuTip == 2) {
                        WhatBookHeHave(readersArrayList.get(index));
                        if (textFieldBooks.size == 0) {
                            try {

                                if (readersArrayList.get(index).yearsLern < 12) {
                                    logNewString((new GregorianCalendar()).getTime() + " читатель удален из системы " + readersArrayList.get(index).surname + " " + readersArrayList.get(index).name + " " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass);
                                } else {
                                    logNewString((new GregorianCalendar()).getTime() + " читатель удален из системы " + readersArrayList.get(index).surname + " " + readersArrayList.get(index).name + " сотрудник");

                                }
                                readersArrayList.remove(index);
                            } catch (NullPointerException e) {

                            }
                            stage.clear();
                            stage.addActor(mainMenuTable);
                            stage.addActor(tableListAllReader);
                            stage.addActor(numberAllBookTable);
                            stage.addActor(infoMenu2Table);
                            stage.addActor(bookOnReaderTable);
                            stage.addActor(searchMenuReaderTable);
                            infoMenuTip = 2;
                            meinMenuUsed();
                            allReaderListUpdate();

                            readerNumber.setText(" " + readersArrayList.size());
                            stage.addActor(deleteTable);
                        } else {

                            errorDelTable.setPosition(850, 130);

                            errorDelLabel.setText("этот читатель вернул не все книги");
                            stage.addActor(errorDelTable);
                        }

                    }
                    if (infoMenuTip == 1) {
                        for (int i = 0; i < bookArrayList.size(); i++) {


                            if (bookArrayList.get(i).reader == null) {
                                if ((bookArrayList.get(index).name + bookArrayList.get(index).author).equals(bookArrayList.get(i).name + bookArrayList.get(i).author)) {
                                    System.out.println(bookNumber);
                                    if (bookNumber == 1) {
                                        try {
                                            Gdx.files.external("/.prefs/Library/cover/" + bookArrayList.get(i).name + bookArrayList.get(i).author + ".png").delete();
                                        } catch (NullPointerException e) {
                                            System.out.println(e.getMessage());
                                        }
                                    }


                                    try {
                                        bookArrayList.remove(i);
                                        numberOfBook--;
                                        logNewString((new GregorianCalendar()).getTime() + " книга удалена " + bookArrayList.get(i).author + " " + bookArrayList.get(i).name);
                                    } catch (NullPointerException e) {

                                    }
                                    stage.clear();
                                    stage.addActor(mainMenuTable);
                                    stage.addActor(tableListAllBook);
                                    stage.addActor(searchMenuBookTable);
                                    stage.addActor(numberAllBookTable);
                                    stage.addActor(readerThisBookTable);
                                    stage.addActor(descriptionInfoTable);
                                    stage.addActor(infoMenuTable);

                                    infoMenuTip = 1;
                                    stage.addActor(deleteTable);
                                    Collections.sort(bookArrayList, new Comparator<Book>() {
                                        public int compare(Book o1, Book o2) {
                                            return o1.name.compareTo(o2.name);
                                        }
                                    });
                                    Collections.sort(bookArrayList, new Comparator<Book>() {
                                        public int compare(Book o1, Book o2) {
                                            return o1.author.compareTo(o2.author);
                                        }
                                    });
                                    allBookListFullUpdate();
                                    allALLBookScrollPaneTable = tableListAllBook;
                                    genreSearch.setItems(" Неопределенный жанр", " Учебники[" + genre1 + "]", " Классика[" + genre2 + "]", " Детская литература[" + genre3 + "]", " Справочная литература[" + genre4 + "]", " Зарубежная литература[" + genre5 + "]");
                                    numberAllBook.setText(" " + numberOfBook);
                                    bookOnLibrary.setText(" " + (numberOfBook - bookOnHendNumberInt));
                                    meinMenuUsed();
                                    break;
                                }

                            } else {

                                errorDelTable.setPosition(450, 200);
                                errorDelLabel.setText("все книги выданы");
                                stage.addActor(errorDelTable);
                            }
                        }
                    }
                }
            }
        });
        redactButton = new TextButton(" Редактировать", skinTree);
        redactButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (chooseObject) {
                    stage.clear();
                    meinMenuUsed();
                    infoMenuTip = 0;
                    stage.addActor(mainMenuTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(redactBook);
                    numberThisBook = 0;
                    for (Book book : bookArrayList) {
                        if ((book.name + book.author + book.genre).equals(bookArrayList.get(index).name +
                                bookArrayList.get(index).author + bookArrayList.get(index).genre)) {
                            numberThisBook++;
                        }
                    }
                    numberBookRedact.setText(String.valueOf(numberThisBook));
                    bookCoverRedact.setText(bookArrayList.get(index).coverBook);
                    bookAuthorRedact.setText(bookArrayList.get(index).author);
                    bookNameRedact.setText(bookArrayList.get(index).name);
                    bookDescriptionRedact.setText(bookArrayList.get(index).description);
                    bookGenreRedact.setSelected(bookArrayList.get(index).genre);
                }

            }
        });


        deleteTable.add(redactButton).pad(2).row();
        deleteTable.add(deleteButton);

        authorWindowPreName = new TextField(" Автор:", skinTree);
        authorWindowPreName.setDisabled(true);
        numberWindowPreName = new TextField(" Количество:", skinTree);
        numberWindowPreName.setDisabled(true);
        numberBookOfHendWindowPreName = new TextField(" В наличии:", skinTree);
        numberBookOfHendWindow = new TextField(" 0", skinTree);
        numberBookOfHendWindow.setDisabled(true);
        numberBookOfHendWindowPreName.setDisabled(true);
        genreWindowPreName = new TextField(" Жанр:", skinTree);
        genreWindowPreName.setDisabled(true);
        nameBookWindowPreName = new TextField(" Название:", skinTree);
        nameBookWindowPreName.setDisabled(true);
        readerThisBookPreName = new TextField(" Читают эту книигу:", skinTree);
        readerThisBookTable.setPosition(Gdx.graphics.getWidth() + 8, Gdx.graphics.getHeight() / 7 * 6);
        readerThisBook = new SelectBox(skinTree);
        readerThisBookPreName.setDisabled(true);

        readerThisBookTable.add(readerThisBookPreName).pad(2).fill(1.4f, 1).row();
        readerThisBookTable.add(readerThisBook).pad(2).size(150, 50);

        infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3 + nameBookWindowPreName.getHeight());


        bookOnReaderTable.setFillParent(true);
        infoMenu2Table.setFillParent(true);
        bookOnReaderTable.setPosition(Gdx.graphics.getWidth() / 4, 50);
        infoMenu2Table.setPosition(Gdx.graphics.getWidth() / 4, -Gdx.graphics.getHeight() / 4 + nameBookWindowPreName.getHeight());

        nameReaderWindowPreName = new TextField(" Имя:", skinTree);
        nameReaderWindowPreName.setDisabled(true);
        surnameReaderWindowPreName = new TextField(" Фамилия:", skinTree);
        surnameReaderWindowPreName.setDisabled(true);
        patronymicReaderWindowPreName = new TextField(" Отчество:", skinTree);
        patronymicReaderWindowPreName.setDisabled(true);
        classReaderWindowPreName = new TextField(" Класс:", skinTree);
        classReaderWindowPreName.setDisabled(true);


        bookThisReader = new SelectBox(skinTree);
        bookThisReaderPreName = new TextField(" Взятые книги", skinTree);


        bookThisReaderPreName.setDisabled(true);

        classReaderWindow = new TextField(" Класс", skinTree);
        classReaderWindow.setDisabled(true);
        nameReaderWindow = new TextField(" Имя", skinTree);
        surnameReaderWindow = new TextField(" Фамилия", skinTree);
        patronymicReaderWindow = new TextField(" Отчество", skinTree);
        nameReaderWindow.setDisabled(true);
        surnameReaderWindow.setDisabled(true);
        patronymicReaderWindow.setDisabled(true);
        infoMenu2Table.add(surnameReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(surnameReaderWindow).fill(1.8f, 1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(nameReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(nameReaderWindow).fill(1.8f, 1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(patronymicReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(patronymicReaderWindow).fill(1.8f, 1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(classReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(classReaderWindow).fill(1.8f, 1).pad(2, 8, 2, 0).row();


        authorWindow = new TextField(" Автор", skinTree);
        authorWindow.setDisabled(true);
        numberWindow = new TextField(" 0", skinTree);
        numberWindow.setDisabled(true);
        imageWindow = new Texture(Gdx.files.internal("noimg.png"));
        genreWindow = new TextField(" Жанр", skinTree);
        genreWindow.setDisabled(true);
        descriptionWindow = new Label(" Описание", skin);
        nameBookWindow = new TextField(" Название", skinTree);
        nameBookWindow.setDisabled(true);
        infoMenuTable.add(nameBookWindowPreName).fill(1.1f, 1).pad(2, 0, 2, 65);
        infoMenuTable.add(nameBookWindow).fill(1.7f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(authorWindowPreName).fill(1.1f, 1).pad(2, 0, 2, 65);
        infoMenuTable.add(authorWindow).fill(1.7f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(genreWindowPreName).fill(1.1f, 1).pad(2, 0, 2, 65);
        infoMenuTable.add(genreWindow).fill(1.7f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(numberWindowPreName).fill(1.1f, 1).pad(2, 0, 2, 65);
        infoMenuTable.add(numberWindow).fill(1.7f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(numberBookOfHendWindowPreName).fill(1.1f, 1).pad(2, 0, 2, 65);
        infoMenuTable.add(numberBookOfHendWindow).fill(1.7f, 1).pad(2, 0, 2, 0).row();
        descriptionWindowTable2 = new Table();
        descriptionWindowTable2.add(descriptionWindow);

        descriptionScrollPane = new ScrollPane(descriptionWindowTable2);
        descriptionScrollPane.setScrollingDisabled(true, false);
        descriptionInfoTable.add(descriptionScrollPane).size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() / 5);

        descriptionInfoTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3 + Screen.nameBookWindowPreName.getHeight() - 3 * numberBookOfHendWindow.getHeight() - Gdx.graphics.getHeight() / 10);
        stage.addActor(deleteTable);
        stage.addActor(descriptionInfoTable);
        stage.addActor(infoMenuTable);
        stage.addActor(readerThisBookTable);
    }


    private void allReaderMenu() {

        allReaderList = new List(skin);
        allReaderScrollPaneTable.row();
        allReaderScrollPane = new ScrollPane(allReaderScrollPaneTable);

        allReaderScrollPane.setScrollingDisabled(false, false);

        noNullPointerException = true;

        tableListAllReader.add(allReaderScrollPane)
                .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 2 * newBook.getHeight() - 70);
        tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 - 30);


    }

    private void allBookMenu() {

        allBookList = new List(skin);
        allBookScrollPaneTable.row();
        allBookScrollPane = new ScrollPane(allBookScrollPaneTable);
        allBookScrollPane.setScrollingDisabled(true, false);
        noNullPointerException = true;
        try {
            tableListAllBook.add(allBookScrollPane)
                    .size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() - 4 * bookAdded.getHeight());


            tableListAllBook.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2);
        } catch (NullPointerException e) {
            noNullPointerException = false;
        }
        if (noNullPointerException) {
            tableListAllBook.add(allBookScrollPane)
                    .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 2 * bookAdded.getHeight() - newBook.getHeight());
            tableListAllBook.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 - 30);
        }

        stage.addActor(tableListAllBook);

    }

    public static void render() {


        renderInfoMenu();

        stage.act();

        stage.draw();
    }

    private static void renderInfoMenu() {
        if (chooseObject) {
            if (infoMenuTip == 1) {
                if (index != -1) {
                    if ((bookArrayList.size() != 0) && (bookArrayList.size() > index)) {


                        if ((!(" " + bookArrayList.get(index).name).equals(nameBookWindow.getText())) ||
                                (!(" " + bookArrayList.get(index).genre).equals(genreWindow.getText())) ||
                                (!(" " + bookArrayList.get(index).author).equals(authorWindow.getText())) ||
                                (!(bookArrayList.get(index).description).equals(descriptionWindow.getText().toString())) ||
                                (!((numberWindow.getText())).equals(" " + (bookNumber)))) {


                            authorWindow.setText(" " + bookArrayList.get(index).author);


                            numberWindow.setText(" " + (bookNumber));
                            numberBookOfHendWindow.setText(" " + (bookNumberOfHend));
                            if (Gdx.files.external(bookArrayList.get(index).coverBook).exists()) {
                                imageWindow = new Texture(Gdx.files.external(bookArrayList.get(index).coverBook));
                            } else {
                                imageWindow = new Texture(Gdx.files.internal("noimg.png"));
                                bookArrayList.get(index).coverBook = "noimg.png";
                            }
                            genreWindow.setText(" " + bookArrayList.get(index).genre);

                            if (bookArrayList.get(index).description.equals("")) {
                                descriptionWindow.setText(" Описание");
                            } else {
                                descriptionWindow.setText(bookArrayList.get(index).description);
                            }
                            nameBookWindow.setText(" " + bookArrayList.get(index).name);


                        }
                    }


                }


            } else if (infoMenuTip == 2) {
                if (index != -1) {
                    if ((readersArrayList.size() != 0) && (readersArrayList.size() > index)) {
                        if (nameReaderWindow.getText().equals("")) {

                            if (!(" " + readersArrayList.get(index).name).equals(nameReaderWindow.getText()) ||
                                    !(" " + readersArrayList.get(index).surname).equals(surnameReaderWindow.getText()) ||
                                    !((((readersArrayList.get(index).yearsLern >= 12) && ((" сотрудник").equals(classReaderWindow.getText())))) ||
                                            (" " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass).equals(classReaderWindow.getText())) ||
                                    !(" " + readersArrayList.get(index).patronymic).equals(patronymicReaderWindow.getText())) {


                                patronymicReaderWindow.setText(" " + readersArrayList.get(index).patronymic);
                                surnameReaderWindow.setText(" " + readersArrayList.get(index).surname);
                                nameReaderWindow.setText(" " + readersArrayList.get(index).name);
                                if (readersArrayList.get(index).yearsLern >= 12) {
                                    classReaderWindow.setText(" сотрудник");
                                } else {
                                    classReaderWindow.setText((" " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass));
                                }

                            }
                        } else {
                            if (!(" " + readersArrayList.get(index).name).equals(nameReaderWindow.getText()) ||
                                    !(" " + readersArrayList.get(index).surname).equals(surnameReaderWindow.getText()) ||
                                    !((((readersArrayList.get(index).yearsLern >= 12) && ((" сотрудник").equals(classReaderWindow.getText())))) ||
                                            (" " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass).equals(classReaderWindow.getText())) ||
                                    !(" " + readersArrayList.get(index).patronymic).equals(patronymicReaderWindow.getText())) {


                                patronymicReaderWindow.setText(" " + readersArrayList.get(index).patronymic);

                                surnameReaderWindow.setText(" " + readersArrayList.get(index).surname);
                                nameReaderWindow.setText(" " + readersArrayList.get(index).name);
                                if (readersArrayList.get(index).yearsLern >= 12) {
                                    classReaderWindow.setText(" сотрудник");
                                } else {
                                    classReaderWindow.setText((" " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass));
                                }
                            }
                        }
                    }

                }
            }


        }
    }

    public void meinMenuUsed() {

        chooseObject = false;
        readerThisBook.setItems();
        bookThisReader.setItems();
        (nameBookWindow).setText(" Название");
        (authorWindow).setText(" Автор");
        (genreWindow).setText(" Жанр");
        (numberWindow).setText(" 0");
        (numberBookOfHendWindow).setText(" 0");
        classReaderWindow.setText(" Класс");
        nameReaderWindow.setText(" Имя");
        surnameReaderWindow.setText(" Фамилия");
        patronymicReaderWindow.setText(" Отчество");

    }

    public void meinMenu() {
        saveButton= new TextButton(" сохранить", skinTree);
        report = new TextButton(" отчеты", skinTree);
        mainMenuTable.setFillParent(true);
        exit = new TextButton(" выход", skinTree);
        newBook = new TextButton(" Добавить книгу", skinTree);
        mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - newBook.getHeight() - 8);
        readerNumber = new TextField(" 0", skinTree);
        bookOnHendNumber = new TextField(" 0", skinTree);
        bookOnLibrary = new TextField(" 0", skinTree);
        readerNumberPreName = new TextField(" Читателей:", skinTree);
        bookOnHendNumberPreName = new TextField(" Книг выдано:", skinTree);
        bookOnLibraryPreName = new TextField(" Книг в наличии:", skinTree);
        bookOAllPreName = new TextField(" Книг:", skinTree);
        numberAllBook = new TextField(" 0", skinTree);
        readerNumber.setDisabled(true);
        bookOnHendNumber.setDisabled(true);
        bookOnLibrary.setDisabled(true);
        readerNumberPreName.setDisabled(true);
        bookOnHendNumberPreName.setDisabled(true);
        bookOnLibraryPreName.setDisabled(true);
        bookOAllPreName.setDisabled(true);
        numberAllBook.setDisabled(true);

        numberAllBookTable.setPosition(4 * numberAllBook.getWidth()
                , numberAllBook.getHeight() + 10);


        newReader = new TextButton("Добавить читателя", skinTree);
        giveBook = new TextButton("Выдать книгу", skinTree);
        returnBook = new TextButton("Вернуть книгу", skinTree);

        dolg = new TextButton("Должники", skinTree);
        allBook = new TextButton("Все книги", skinTree);
        myBook = new TextButton("Книги в наличии", skinTree);
        readers = new TextButton("Все читатели", skinTree);
        onHands = new TextButton("Книги на руках", skinTree);
        numberAllBookTable.add(bookOAllPreName).pad(2, 1, 2, 1);
        numberAllBookTable.add(numberAllBook).pad(2, 1, 2, 2);
        numberAllBookTable.add(bookOnLibraryPreName).pad(2, 30, 2, 30).fill(1.4f, 1);
        numberAllBookTable.add(bookOnLibrary).pad(2, 2, 2, 2).row();
        numberAllBookTable.add(readerNumberPreName).pad(2, 1, 2, 1);
        numberAllBookTable.add(readerNumber).pad(2, 1, 2, 2);
        numberAllBookTable.add(bookOnHendNumberPreName).pad(2, 30, 2, 30).fill(1.4f, 1);
        numberAllBookTable.add(bookOnHendNumber).pad(2, 1, 2, 1);
        mainMenuTable.add(newBook).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(newReader).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(giveBook).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(returnBook).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(report).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(exit).fillX().pad(0, 2, 0, 0);
        mainMenuTable.row().pad(10, 0, 10, 0);
        mainMenuTable.add(allBook).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(myBook).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(readers).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(onHands).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(dolg).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(saveButton).fillX().pad(2, 2, 0, 0);
        stage.addActor(numberAllBookTable);
        reportTable.setFillParent(true);
        reportTable.setPosition(0, 200);
        reportString = new TextField("", skinTree);
        reportString.setMessageText(" путь до отчета(по умолчанию загрузки)");
        reportAll = new TextButton(" полный отчет ", skinTree);
        reportGivReturn = new TextButton(" отчет о выдаче книг читателям ", skinTree);
        reportNull = new TextButton(" обнулить отчеты ", skinTree);
        reportOnName = new TextButton(" отчет на человека ", skinTree);
        reportTable.add();
        reportTable.add(reportString).fill(2, 1).pad(2, 20, 8, 0);
        reportTable.add().row();
        reportTable.add(reportAll).fillX().pad(2, 0, 0, 2);
        reportTable.add(reportGivReturn).fillX().pad(2, 2, 0, 2);
        reportTable.add(reportOnName).fillX().pad(2, 2, 0, 2);
        reportTable.add(reportNull).fillX().pad(2, 2, 0, 2);

        delReportTable.setFillParent(true);

        delReportText = new TextField(" удалить все запитси отчетов(уже сделанные отчеты удалены не будут)", skinTree);
        delReportText.setDisabled(true);
        delReportYes = new TextButton("да", skinTree);
        delReportNo = new TextButton("нет", skinTree);
        delReportTable.add();
        delReportTable.add(delReportText).fill(6, 2).pad(2).row();
        delReportTable.add(delReportNo).pad(30);
        delReportTable.add();
        delReportTable.add(delReportYes).pad(30);
        delReportNo.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {
                stage.clear();
                infoMenuTip = -2;
                meinMenuUsed();
                stage.addActor(mainMenuTable);
                stage.addActor(numberAllBookTable);
                stage.addActor(reportTable);
                reportOnNameOn = false;
                readersOnReportMenuTable.clear();
                stage.addActor(readersOnReportMenuTable);
                readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                reportCharName.setSelected(0);
                reportNameName.setSelected(0);
                reportYearsName.setSelected(0);
                reportString.setMessageText(" путь до отчета(по умолчанию загрузки)");
                reportString.setColor(Color.WHITE);
            }
        });

        delReportYes.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {

                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/report.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportOnName.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                stage.clear();
                infoMenuTip = -2;
                meinMenuUsed();
                stage.addActor(mainMenuTable);
                stage.addActor(numberAllBookTable);
                stage.addActor(reportTable);
                reportOnNameOn = false;
                readersOnReportMenuTable.clear();
                stage.addActor(readersOnReportMenuTable);
                readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                reportCharName.setSelected(0);
                reportNameName.setSelected(0);
                reportYearsName.setSelected(0);
                reportString.setMessageText(" путь до отчета(по умолчанию загрузки)");
                reportString.setColor(Color.WHITE);
            }
        });


        reportYearsName = new SelectBox(skinTree);
        reportCharName = new SelectBox(skinTree);
        reportNameName = new SelectBox(skinTree);
        reportYearsName.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудники");
        readersOnReportMenuTable.setFillParent(true);
        readersOnReportMenuTable.setPosition(165, 50);
        readersOnReportMenuTable.add(reportYearsName).pad(2).row();
        reportYearsName.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (reportYearsName.getSelectedIndex()==11){
                    getReadersSurnameByClass(reportYearsName.getSelectedIndex() + 1, "");
                    reportNameName.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
                    readersOnReportMenuTable.clear();
                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add(reportNameName).pad(2).row();
                }else {
                    charOfClassByYears(reportYearsName.getSelectedIndex() + 1);
                    reportCharName.setItems(charOfClassArray);
                    readersOnReportMenuTable.clear();
                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add(reportCharName).pad(2).row();
                }
            }
        });
        reportCharName.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {


                    getReadersSurnameByClass(reportYearsName.getSelectedIndex() + 1, (String) reportCharName.getSelected());
                    reportNameName.setItems(surnameOfReadersOnGivMenuArrayList.toArray());

                    readersOnReportMenuTable.clear();

                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add(reportCharName).pad(2).row();
                    readersOnReportMenuTable.add(reportNameName).pad(2).row();

            }
        });

        reportNameName.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (reportYearsName.getSelectedIndex()==11){
                    readersOnReportMenuTable.clear();
                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add().row();
                    readersOnReportMenuTable.add(reportNameName).pad(2).row();
                    reportOnNameOn = true;
                }else {
                    readersOnReportMenuTable.clear();
                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add(reportCharName).pad(2).row();
                    readersOnReportMenuTable.add(reportNameName).pad(2).row();
                    reportOnNameOn = true;
                }
            }
        });

        reportAll.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {

                if (Objects.equals(reportString.getText(), "")) {
                    try {
                        (Gdx.files.external("/.prefs/Library/report.txt")).copyTo(Gdx.files.external("/Downloads/отчет.txt"));
                    } catch (Exception e) {

                    }

                } else {
                    if (Gdx.files.absolute(reportString.getText()).exists()) {
                        try {
                            (Gdx.files.external("/.prefs/Library/report.txt")).copyTo(Gdx.files.absolute(reportString.getText() + "/отчет.txt"));
                        } catch (Exception e) {

                        }
                    } else {
                        reportString.setText(null);
                        reportString.setMessageText("такого пути не существует");
                        reportString.setColor(Color.RED);
                    }
                }

            }
        });

        reportGivReturn.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {

                if (Objects.equals(reportString.getText(), "")) {
                    try {
                        (Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).copyTo(Gdx.files.external("/Downloads/отчет о выдаче книг.txt"));
                    } catch (Exception e) {

                    }

                } else {
                    if (Gdx.files.absolute(reportString.getText()).exists()) {
                        try {
                            (Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).copyTo(Gdx.files.absolute(reportString.getText() + "/отчет о выдаче книг.txt"));
                        } catch (Exception e) {

                        }
                    } else {
                        reportString.setText(null);
                        reportString.setMessageText(" такого пути не существует");
                        reportString.setColor(Color.RED);
                    }
                }

            }
        });
        reportOnName.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {
                if (reportOnNameOn) {
                    if (reportYearsName.getSelectedIndex() + 1 < 12) {
                        reportName = reportNameName.getSelected() + " " + (reportYearsName.getSelectedIndex() + 1) + " " + reportCharName.getSelected();
                    } else {
                        reportName = reportNameName.getSelected() + " сотрудник";

                    }
                    try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportOnName.txt")).file(), false

                    )) {
                        writer.write("");
                        writer.flush();
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
                    try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                        try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportOnName.txt")).file(), true

                        )) {
                            int c;
                            String s = "";

                            while ((c = reader.read()) != -1) {

                                s += ((char) c);
                            }
                            for (String s1 : s.split("\n")) {

                                if (s1.contains(reportName)) {


                                    // запись всей строки
                                    String text = s1;
                                    writer.write(text);
                                    // запись по символам
                                    writer.append('\n');


                                    writer.flush();

                                }
                            }


                            if (Objects.equals(reportString.getText(), "")) {
                                try {
                                    (Gdx.files.external("/.prefs/Library/reportOnName.txt")).copyTo(Gdx.files.external("/Downloads/отчет " + reportName + ".txt"));
                                } catch (Exception e) {

                                }

                            } else {
                                if (Gdx.files.absolute(reportString.getText()).exists()) {
                                    try {
                                        (Gdx.files.external("/.prefs/Library/reportOnName.txt")).copyTo(Gdx.files.absolute(reportString.getText() + "/отчет " + reportName + ".txt"));
                                    } catch (Exception e) {

                                    }
                                } else {
                                    reportString.setText(null);
                                    reportString.setMessageText("такого пути не существует");
                                    reportString.setColor(Color.RED);
                                }
                            }


                        } catch (IOException ex) {

                            System.out.println(ex.getMessage());
                        }
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
                }
            }
        });
        reportNull.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {

                stage.clear();
                stage.addActor(delReportTable);
            }
        });
        exit.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                Gdx.app.exit();
            }
        });
        report.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {
                stage.clear();
                infoMenuTip = -2;
                meinMenuUsed();
                stage.addActor(mainMenuTable);
                stage.addActor(numberAllBookTable);
                stage.addActor(reportTable);
                reportOnNameOn = false;
                readersOnReportMenuTable.clear();
                stage.addActor(readersOnReportMenuTable);
                readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                reportCharName.setSelected(0);
                reportNameName.setSelected(0);
                reportYearsName.setSelected(0);
                reportString.setMessageText(" путь до отчета(по умолчанию загрузки)");
                reportString.setColor(Color.WHITE);

            }
        });
        saveButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
           Library.saveAll();
            }
        });
        dolg.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(numberAllBookTable);
                stage.addActor(infoMenu2Table);
                stage.addActor(dolgBookTable);
                infoMenuTip = 2;
                nowData = new GregorianCalendar();
                allDolgListUpdate();
                meinMenuUsed();
                stage.addActor(tableListAllReader);
            }
        });


        returnBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                meinMenuUsed();
                infoMenuTip = -1;
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(returnMenuTable);
                returnMenuTable.clear();
                returnMenuTable.add(classOfReadersOnReturnMenuSelectBox);

                classOfReadersOnReturnMenuSelectBox.setSelected(0);
                stage.addActor(numberAllBookTable);

            }
        });

        newReader.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(newReaderTable);
                stage.addActor(numberAllBookTable);
                infoMenuTip = -1;
                nameReader.setText("");
                charClass.setText("");
                surnameReader.setText("");
                patronymicReader.setText("");
                meinMenuUsed();
                nameReader.setColor(Color.WHITE);
                surnameReader.setColor(Color.WHITE);
                patronymicReader.setColor(Color.WHITE);

            }
        });
        giveBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                meinMenuUsed();
                infoMenuTip = -1;
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(giveBookButtonTable);
                stage.addActor(readersOnGivMenuTable);
                readersOnGivMenuTable.clear();
                readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox);
                bookOnGivMenuTable.clear();
                bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox);
                genreOfBookOnGivMenuSelectBox.setSelected(0);
                classOfReadersOnGivMenuSelectBox.setSelected(0);
                stage.addActor(bookOnGivMenuTable);
                stage.addActor(numberAllBookTable);

            }
        });
        onHands.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
                stage.addActor(tableListAllBook);
                stage.addActor(descriptionInfoTable);
                stage.addActor(infoMenuTable);
                getAuthorForSearch();
                bookMenuTipNow = 1;
                descriptionWindow.setText(" Описание");
                stage.addActor(readerThisBookTable);
                infoMenuTip = 1;
                allBookOnHendListUpdate();
                meinMenuUsed();
                stage.addActor(searchMenuBookTable);
            }
        });

        readers.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2);
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllReader);
                stage.addActor(numberAllBookTable);
                stage.addActor(infoMenu2Table);
                stage.addActor(bookOnReaderTable);
                infoMenuTip = 2;
                meinMenuUsed();
                stage.addActor(searchMenuReaderTable);
                getCharForSerch();
                getYearsForSerch();


                allReaderListUpdate();

                stage.addActor(deleteTable);
                deleteTable.clear();
                deleteTable.setPosition(594, 150);

                deleteTable.add(deleteButton);

            }
        });


        allBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                stage.clear();
                stage.addActor(mainMenuTable);

                if (authorSearch.getSelectedIndex() == 0 && nameBookSearch.getText().equals("") && genreSearch.getSelectedIndex() == 0) {
                    stage.addActor(allALLBookScrollPaneTable);
                } else {
                    stage.addActor(tableListAllBook);
                    allBookListUpdate();
                }
                stage.addActor(numberAllBookTable);
                stage.addActor(readerThisBookTable);
                descriptionWindow.setText(" Описание");
                stage.addActor(descriptionInfoTable);
                stage.addActor(infoMenuTable);
                infoMenuTip = 1;
                stage.addActor(deleteTable);

                meinMenuUsed();
                getAuthorForSearch();
                bookMenuTipNow = 0;
                stage.addActor(searchMenuBookTable);
                deleteTable.clear();
                deleteTable.setPosition(740, 180);
                deleteTable.add(redactButton).pad(2).row();
                deleteTable.add(deleteButton);
            }
        });

        myBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                stage.clear();
                meinMenuUsed();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
                stage.addActor(readerThisBookTable);
                stage.addActor(infoMenuTable);
                stage.addActor(descriptionInfoTable);
                getAuthorForSearch();
                bookMenuTipNow = 2;
                infoMenuTip = 1;
                allBookScrollPaneTable.clear();
                stage.addActor(searchMenuBookTable);
                allBookOnMyHendListUpdate();


            }
        });

        newBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(newBookTable);
                stage.addActor(addNewBookTable);

                stage.addActor(descriptionTable);
                stage.addActor(numberAllBookTable);
                infoMenuTip = -1;
                meinMenuUsed();
                nameBook.setText(null);

                author.setText(null);
                pathToImage.setText(null);
                number.setText(null);
                description.setText(null);
                genre.setSelected(1);
                addNewBookTable.clear();
                addNewBookTable.add(number).pad(0, 0, 0, 50);
                addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0);

            }
        });

    }

    public void logNewString(String str) {
        try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/report.txt")).file(), true)) {

            writer.write(str);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (str.contains("выдана") || str.contains("вернул")) {
            try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).file(), true)) {
                writer.write(str);
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }


    }

    public void newBookMenu() {
        newBookTable.setFillParent(true);
        newBookTable.setPosition(0, 50);
        addNewBookTable.setFillParent(true);
        nameBook = new TextField("", skinTree);
        nameBook.setMessageText(" Название");
        addNewBookTable.setPosition(0, -5 * nameBook.getHeight() + 50);
        descriptionTable.setHeight(0.1f);
        descriptionTable.setFillParent(true);
        descriptionTable.setPosition(0, -3 * nameBook.getHeight() + 50);
        genre = new SelectBox(skinTree);
        genre.setItems(" Неопределенный жанр", " Учебники", " Классика", " Детская литература", " Справочная литература", " Зарубежная литература");
        bookAdded = new TextButton("Добавить", skinTree);
        author = new TextField("", skinTree);
        number = new TextField("", skinTree);


        description = new TextField("", skinTree);
        author.setMessageText(" Автор");
        pathToImage = new TextField("", skinTree);
        pathToImage.setMessageText(" Путь до обложки");
        number.setMessageText(" Количество");

        description.setMessageText(" Описание");

        newBookTable.add(nameBook).fillX().pad(0, 0, 10, 0).row();
        newBookTable.add(author).fillX().pad(0, 0, 10, 0).row();
        newBookTable.add(genre).fillX().pad(0, 0, 10, 0).row();
        newBookTable.add(pathToImage).fill(1.5f, 1).pad(0, 0, 10, 0).row();
        descriptionTable.add(description).fill(6, 1).row();
        addNewBookTable.add(number).pad(0, 0, 0, 0);
        addNewBookTable.add(bookAdded).pad(0, 0, 0, 0);
        newBookTable.row().pad(10, 0, 10, 0);


        nameBook.setColor(1, 1, 1, 1);
        author.setColor(1, 1, 1, 1);
        number.setColor(1, 1, 1, 1);
        description.setColor(1, 1, 1, 1);

        genre.setColor(1, 1, 1, 1);
        pathToImage.setColor(1, 1, 1, 1);
        bookAdded.setColor(1, 1, 1, 1);


        bookAdded.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {

                error = new Label(" ", skin, "red");

                nameBook.setColor(1, 1, 1, 1);
                author.setColor(1, 1, 1, 1);
                number.setColor(1, 1, 1, 1);

                noError = true;

                addNewBookTable.clear();
                try {
                    Integer.parseInt(number.getText());
                } catch (NumberFormatException e) {
                    number.setText(null);
                    System.out.println("k");
                    noError = false;

                    error = new Label("Количество должно быть числом", skin);
                    addNewBookTable.add(number).pad(0, 0, 0, 50);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                    addNewBookTable.add(error).fill().pad(0, 4, 0, 0);

                }

                if (!pathToImage.getText().equals("")) {


                    if (Gdx.files.absolute(pathToImage.getText()).exists()) {
                        coverBook = ("/.prefs/Library/cover/" + nameBook.getText() + author.getText());
                    } else {


                        pathToImage.setText(null);

                        noError = false;
                        error = new Label("Неправильный путь", skin);
                        addNewBookTable.add(number).pad(0, 0, 0, 50);
                        addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                        addNewBookTable.add(error).fill().pad(0, 4, 0, 0);

                    }

                } else {
                    coverBook = ("noimg.png");
                }

                if ((nameBook.getText().equals("")) || (author.getText().equals("")) || (number.getText().equals(""))) {


                    error.clear();
                    addNewBookTable.clear();
                    noError = false;
                    error = new Label(" Заполните обязательные поля", skin, "red");

                    addNewBookTable.add(number).pad(0, 0, 0, 0);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                    addNewBookTable.add(error).fill().pad(0, 4, 0, 0);
                }
                if (noError) {
                    if (Integer.parseInt(number.getText()) > 200) {

                        error.clear();
                        addNewBookTable.clear();
                        noError = false;
                        error = new Label(" максимум 200 книг за раз", skin, "red");

                        addNewBookTable.add(number).pad(0, 0, 0, 0);
                        addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                        addNewBookTable.add(error).fill().pad(0, 4, 0, 0);
                    }
                }


                if (noError) {
                    if (!pathToImage.getText().equals("")) {
                        Gdx.files.absolute(pathToImage.getText()).copyTo(Gdx.files.external("/.prefs/Library/cover/" + nameBook.getText() + author.getText() + ".png"));
                    }

                    numberOfBook += Integer.parseInt(number.getText());


                    addNewBookTable.clear();
                    addNewBookTable.add(number).pad(0, 0, 0, 50);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0);


                    if ((Objects.equals(nameBook.getText(), "darkCat")
                            && (Objects.equals(author.getText(), "Хорошков Вадим")))) {
                        description.setText("данную программу написал Хорошков Вадим");
                    }


                    descriptionString = "";
                    for (int i = 1; i < description.getText().length() + 1; i++) {
                        descriptionString += description.getText().charAt(i - 1);

                        if ((i % 25 / 16 > 0) && ((String.valueOf(description.getText().charAt(i - 1))).equals(" "))) {
                            descriptionString += "\n";
                        }
                    }

                    logNewString((new GregorianCalendar()).getTime() + " новая книга " + nameBook.getText() + " " +
                            author.getText() + " " + genre.getSelected() + " в количестве" + Integer.parseInt(number.getText()) + " штук");
                    for (int i = 0; i < Integer.parseInt(number.getText()); i++) {
                        bookArrayList.add(new Book(nameBook.getText(), author.getText(),
                                (String) genre.getSelected(), descriptionString, coverBook));


                        Library.saveNewBook(nameBook.getText(), author.getText(),
                                descriptionString, (String) genre.getSelected(), coverBook);

                    }


                    stage.clear();
                    meinMenuUsed();
                    stage.addActor(mainMenuTable);
                    stage.addActor(tableListAllBook);
                    stage.addActor(searchMenuBookTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(readerThisBookTable);
                    stage.addActor(infoMenuTable);
                    stage.addActor(descriptionInfoTable);
                    getAuthorForSearch();
                    bookMenuTipNow = 0;
                    infoMenuTip = 1;
                    allBookScrollPaneTable.clear();
                    stage.addActor(deleteTable);
                    deleteTable.clear();
                    deleteTable.setPosition(740, 180);
                    deleteTable.add(redactButton).pad(2).row();
                    deleteTable.add(deleteButton);
                    Collections.sort(bookArrayList, new Comparator<Book>() {
                        public int compare(Book o1, Book o2) {
                            return o1.name.compareTo(o2.name);
                        }
                    });
                    Collections.sort(bookArrayList, new Comparator<Book>() {
                        public int compare(Book o1, Book o2) {
                            return o1.author.compareTo(o2.author);
                        }
                    });
                    allBookListFullUpdate();
                    allALLBookScrollPaneTable = tableListAllBook;
                    numberAllBook.setText(" " + numberOfBook);
                    genreSearch.setItems(" Неопределенный жанр", " Учебники[" + genre1 + "]", " Классика[" + genre2 + "]", " Детская литература[" + genre3 + "]", " Справочная литература[" + genre4 + "]", " Зарубежная литература[" + genre5 + "]");
                    bookOnLibrary.setText(" " + (numberOfBook - bookOnHendNumberInt));

                }
            }
        });

    }

    public void allDolgListUpdate() {

        Collections.sort(readersArrayList, new Comparator<Readers>() {
            public int compare(Readers o1, Readers o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(readersArrayList, new Comparator<Readers>() {
            public int compare(Readers o1, Readers o2) {
                return o1.surname.compareTo(o2.surname);
            }
        });

        allReaderScrollPaneTable.clear();

        for (Book book : bookArrayList) {

            for (int i = 0; i < readersArrayList.size(); i++) {
                try {


                    if ((book.reader.equals(readersArrayList.get(i))) &&
                            (book.dataOfGiven.getTimeInMillis() + 1.21e+9 < nowData.getTimeInMillis())
                    ) {

                        if (readersArrayList.get(i).yearsLern >= 12) {
                            newReaderAdded = new TextButton(" " + readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " сотрудник ", skinTree);
                        } else {
                            newReaderAdded = new TextButton(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                    readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass, skinTree);
                        }
                        newReaderAdded.setName(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass);
                        newReaderAdded.addListener(new ChangeListener() {
                            @Override
                            public void changed(ChangeEvent event, Actor actor) {
                                for (int i = 0; i < readersArrayList.size(); i++) {
                                    if ((readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                            readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass).equals(actor.getName())) {
                                        index = i;

                                        chooseObject = true;
                                        WhatBookHeHaveDolg(readersArrayList.get(i));
                                        dolgBook.setItems(textFieldBooks);
                                    }
                                }
                            }
                        });
                        allReaderScrollPaneTable.add(newReaderAdded).size(newReaderAdded.getWidth(), newReaderAdded.getHeight()).row();
                    }
                } catch (NullPointerException e) {
                }
            }
        }
    }

    public void allBookOnHendListUpdate() {
        Collections.sort(bookArrayList, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(bookArrayList, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });


        allBookScrollPaneTable.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive = false;
            if (bookArrayList.get(i).dataOfGiven != null) {
                bookExclusive = true;
            }
            if (bookExclusive) {
                for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                    if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {
                        bookExclusive = false;
                    }
                }
                if (bookExclusive) {
                    if (bookArrayList.get(i).author.length() < 20) {
                        nameNewBookButton = " " + bookArrayList.get(i).author;
                    } else {
                        nameNewBookButton = " " + bookArrayList.get(i).author.charAt(0) + bookArrayList.get(i).author.charAt(1)
                                + bookArrayList.get(i).author.charAt(2) + bookArrayList.get(i).author.charAt(3)
                                + bookArrayList.get(i).author.charAt(4) + bookArrayList.get(i).author.charAt(5)
                                + bookArrayList.get(i).author.charAt(6) + bookArrayList.get(i).author.charAt(7)
                                + bookArrayList.get(i).author.charAt(8) + bookArrayList.get(i).author.charAt(9)
                                + bookArrayList.get(i).author.charAt(10) + bookArrayList.get(i).author.charAt(11)
                                + bookArrayList.get(i).author.charAt(12) + bookArrayList.get(i).author.charAt(13)
                                + bookArrayList.get(i).author.charAt(14) + bookArrayList.get(i).author.charAt(15)
                                + bookArrayList.get(i).author.charAt(16) + bookArrayList.get(i).author.charAt(17)
                                + bookArrayList.get(i).author.charAt(18) + bookArrayList.get(i).author.charAt(19) + " .";

                    }

                    if ((bookArrayList.get(i).name.length() < 20) || (Objects.equals(bookArrayList.get(i).author, "- ") && (bookArrayList.get(i).name.length() < 40))) {
                        nameNewBookButton = nameNewBookButton + "  " + bookArrayList.get(i).name + " ";
                    } else if (Objects.equals(bookArrayList.get(i).author, "- ")) {
                        nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                                + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                                + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                                + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                                + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                                + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                                + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                                + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                                + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                                + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19)
                                + bookArrayList.get(i).name.charAt(20) + bookArrayList.get(i).name.charAt(21)
                                + bookArrayList.get(i).name.charAt(22) + bookArrayList.get(i).name.charAt(23)
                                + bookArrayList.get(i).name.charAt(24) + bookArrayList.get(i).name.charAt(25)
                                + bookArrayList.get(i).name.charAt(26) + bookArrayList.get(i).name.charAt(27)
                                + bookArrayList.get(i).name.charAt(28) + bookArrayList.get(i).name.charAt(29)
                                + bookArrayList.get(i).name.charAt(30) + bookArrayList.get(i).name.charAt(31)
                                + bookArrayList.get(i).name.charAt(32) + bookArrayList.get(i).name.charAt(33)
                                + bookArrayList.get(i).name.charAt(34) + bookArrayList.get(i).name.charAt(35)
                                + bookArrayList.get(i).name.charAt(36) + bookArrayList.get(i).name.charAt(37)
                                + bookArrayList.get(i).name.charAt(38) + " .";

                    } else {
                        nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                                + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                                + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                                + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                                + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                                + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                                + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                                + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                                + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                                + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19) + " .";
                    }


                    newBookAdded = new TextButton(nameNewBookButton, skinTree);


                    newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                    newBookAdded.addListener(new ChangeListener() {
                        @Override
                        public void changed(ChangeEvent event, Actor actor) {
                            for (int i = 0; i < bookArrayList.size(); i++) {
                                if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                    index = i;
                                    readerThisBookUpdate(bookArrayList.get(i));
                                    chooseObject = true;
                                }
                            }
                        }
                    });
                    allBookScrollPaneTable.add(newBookAdded).pad(2).row();
                }
            }
        }
    }

    public void allBookOnMyHendListUpdate() {
        Collections.sort(bookArrayList, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(bookArrayList, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });


        allBookScrollPaneTable.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive = false;
            if (bookArrayList.get(i).dataOfGiven == null) {
                bookExclusive = true;

            }


            for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {

                    bookExclusive = false;

                }


            }

            if (bookExclusive) {
                if (bookArrayList.get(i).author.length() < 20) {
                    nameNewBookButton = " " + bookArrayList.get(i).author;
                } else {
                    nameNewBookButton = " " + bookArrayList.get(i).author.charAt(0) + bookArrayList.get(i).author.charAt(1)
                            + bookArrayList.get(i).author.charAt(2) + bookArrayList.get(i).author.charAt(3)
                            + bookArrayList.get(i).author.charAt(4) + bookArrayList.get(i).author.charAt(5)
                            + bookArrayList.get(i).author.charAt(6) + bookArrayList.get(i).author.charAt(7)
                            + bookArrayList.get(i).author.charAt(8) + bookArrayList.get(i).author.charAt(9)
                            + bookArrayList.get(i).author.charAt(10) + bookArrayList.get(i).author.charAt(11)
                            + bookArrayList.get(i).author.charAt(12) + bookArrayList.get(i).author.charAt(13)
                            + bookArrayList.get(i).author.charAt(14) + bookArrayList.get(i).author.charAt(15)
                            + bookArrayList.get(i).author.charAt(16) + bookArrayList.get(i).author.charAt(17)
                            + bookArrayList.get(i).author.charAt(18) + bookArrayList.get(i).author.charAt(19) + " .";

                }

                if (bookArrayList.get(i).name.length() < 20 || (Objects.equals(bookArrayList.get(i).author, "- ") && (bookArrayList.get(i).name.length() < 40))) {
                    nameNewBookButton = nameNewBookButton + "  " + bookArrayList.get(i).name + " ";
                } else if (Objects.equals(bookArrayList.get(i).author, "- ")) {
                    nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                            + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                            + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                            + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                            + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                            + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                            + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                            + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                            + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                            + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19)
                            + bookArrayList.get(i).name.charAt(20) + bookArrayList.get(i).name.charAt(21)
                            + bookArrayList.get(i).name.charAt(22) + bookArrayList.get(i).name.charAt(23)
                            + bookArrayList.get(i).name.charAt(24) + bookArrayList.get(i).name.charAt(25)
                            + bookArrayList.get(i).name.charAt(26) + bookArrayList.get(i).name.charAt(27)
                            + bookArrayList.get(i).name.charAt(28) + bookArrayList.get(i).name.charAt(29)
                            + bookArrayList.get(i).name.charAt(30) + bookArrayList.get(i).name.charAt(31)
                            + bookArrayList.get(i).name.charAt(32) + bookArrayList.get(i).name.charAt(33)
                            + bookArrayList.get(i).name.charAt(34) + bookArrayList.get(i).name.charAt(35)
                            + bookArrayList.get(i).name.charAt(36) + bookArrayList.get(i).name.charAt(37)
                            + bookArrayList.get(i).name.charAt(38) + " .";

                } else {
                    nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                            + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                            + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                            + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                            + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                            + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                            + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                            + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                            + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                            + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19) + " .";
                }

                newBookAdded = new TextButton(nameNewBookButton, skinTree);

                newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                newBookAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        for (int i = 0; i < bookArrayList.size(); i++) {
                            if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                index = i;
                                readerThisBookUpdate(bookArrayList.get(i));
                                chooseObject = true;
                            }
                        }
                    }
                });
                allBookScrollPaneTable.add(newBookAdded).pad(2).row();
            }
        }
    }

    public void allBookListUpdate() {


        allBookScrollPaneTable.clear();

        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive = true;
            for (Actor child : allBookScrollPaneTable.getChildren()) {
                if (child.getName().equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {
                    bookExclusive = false;
                }
            }

            if (bookExclusive) {
                if (((genreSearch.getSelectedIndex() == 0) || (genreSearch.getSelected().equals(bookArrayList.get(i).genre + "[" + genre1 + "]"))
                        || (genreSearch.getSelected().equals(bookArrayList.get(i).genre + "[" + genre2 + "]"))
                        || (genreSearch.getSelected().equals(bookArrayList.get(i).genre + "[" + genre3 + "]"))
                        || (genreSearch.getSelected().equals(bookArrayList.get(i).genre + "[" + genre4 + "]"))
                        || (genreSearch.getSelected().equals(bookArrayList.get(i).genre + "[" + genre5 + "]"))
                )
                        && ((nameBookSearch.getText().equals("")) || (bookArrayList.get(i).name.contains(nameBookSearch.getText())))
                        && ((authorSearch.getSelectedIndex() == 0) || (authorSearch.getSelected().equals(bookArrayList.get(i).author)))) {

                    if (bookArrayList.get(i).author.length() < 20) {
                        nameNewBookButton = " " + bookArrayList.get(i).author;
                    } else {
                        nameNewBookButton = " " + bookArrayList.get(i).author.charAt(0) + bookArrayList.get(i).author.charAt(1)
                                + bookArrayList.get(i).author.charAt(2) + bookArrayList.get(i).author.charAt(3)
                                + bookArrayList.get(i).author.charAt(4) + bookArrayList.get(i).author.charAt(5)
                                + bookArrayList.get(i).author.charAt(6) + bookArrayList.get(i).author.charAt(7)
                                + bookArrayList.get(i).author.charAt(8) + bookArrayList.get(i).author.charAt(9)
                                + bookArrayList.get(i).author.charAt(10) + bookArrayList.get(i).author.charAt(11)
                                + bookArrayList.get(i).author.charAt(12) + bookArrayList.get(i).author.charAt(13)
                                + bookArrayList.get(i).author.charAt(14) + bookArrayList.get(i).author.charAt(15)
                                + bookArrayList.get(i).author.charAt(16) + bookArrayList.get(i).author.charAt(17)
                                + bookArrayList.get(i).author.charAt(18) + bookArrayList.get(i).author.charAt(19) + " .";

                    }

                    if (bookArrayList.get(i).name.length() < 20 || (Objects.equals(bookArrayList.get(i).author, "- ") && (bookArrayList.get(i).name.length() < 40))) {
                        nameNewBookButton = nameNewBookButton + "  " + bookArrayList.get(i).name + " ";
                    } else if (Objects.equals(bookArrayList.get(i).author, "- ")) {
                        nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                                + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                                + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                                + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                                + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                                + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                                + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                                + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                                + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                                + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19)
                                + bookArrayList.get(i).name.charAt(20) + bookArrayList.get(i).name.charAt(21)
                                + bookArrayList.get(i).name.charAt(22) + bookArrayList.get(i).name.charAt(23)
                                + bookArrayList.get(i).name.charAt(24) + bookArrayList.get(i).name.charAt(25)
                                + bookArrayList.get(i).name.charAt(26) + bookArrayList.get(i).name.charAt(27)
                                + bookArrayList.get(i).name.charAt(28) + bookArrayList.get(i).name.charAt(29)
                                + bookArrayList.get(i).name.charAt(30) + bookArrayList.get(i).name.charAt(31)
                                + bookArrayList.get(i).name.charAt(32) + bookArrayList.get(i).name.charAt(33)
                                + bookArrayList.get(i).name.charAt(34) + bookArrayList.get(i).name.charAt(35)
                                + bookArrayList.get(i).name.charAt(36) + bookArrayList.get(i).name.charAt(37)
                                + bookArrayList.get(i).name.charAt(38) + " ";

                    } else {
                        nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                                + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                                + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                                + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                                + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                                + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                                + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                                + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                                + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                                + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19) + " .";
                    }

                    newBookAdded = new TextButton(nameNewBookButton, skinTree);
                    ;
                    newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                    newBookAdded.addListener(new ChangeListener() {
                        @Override
                        public void changed(ChangeEvent event, Actor actor) {
                            for (int i = 0; i < bookArrayList.size(); i++) {
                                if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                    index = i;
                                    readerThisBookUpdate(bookArrayList.get(i));
                                    chooseObject = true;
                                    bookNumber = 0;
                                    bookNumberOfHend = 0;
                                    for (int j = 0; j < bookArrayList.size(); j++) {
                                        if ((bookArrayList.get(j).name.equals(bookArrayList.get(index).name)) && (bookArrayList.get(j).genre.equals(bookArrayList.get(index).genre)) && ((bookArrayList.get(j).author.equals(bookArrayList.get(index).author)))) {
                                            bookNumber++;
                                            if (bookArrayList.get(j).dataOfGiven == null) {
                                                bookNumberOfHend++;
                                            }

                                        }
                                    }


                                }
                            }
                        }
                    });
                    allBookScrollPaneTable.add(newBookAdded).pad(2).row();
                }
            }
        }
    }

    public void allBookListFullUpdate() {


        allBookScrollPaneTable.clear();
        genre1 = 0;
        genre2 = 0;
        genre3 = 0;
        genre4 = 0;
        genre5 = 0;
        for (int i = 0; i < bookArrayList.size(); i++) {

            if (bookArrayList.get(i).genre.equals(" Учебники")) {
                genre1++;
            }
            if (bookArrayList.get(i).genre.equals(" Классика")) {
                genre2++;
            }
            if (bookArrayList.get(i).genre.equals(" Детская литература")) {
                genre3++;
            }
            if (bookArrayList.get(i).genre.equals(" Справочная литература")) {
                genre4++;
            }
            if (bookArrayList.get(i).genre.equals(" Зарубежная литература")) {
                genre5++;
            }


            bookExclusive = true;
            for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {
                    bookExclusive = false;
                }


            }


            if (((genreSearch.getSelectedIndex() == 0) || (genreSearch.getSelected().equals(bookArrayList.get(i).genre)))
                    && ((nameBookSearch.getText().equals("")) || (bookArrayList.get(i).name.contains(nameBookSearch.getText())))
                    && ((authorSearch.getSelectedIndex() == 0) || (authorSearch.getSelected().equals(bookArrayList.get(i).author)))) {
                if (bookExclusive) {
                    if (bookArrayList.get(i).author.length() < 20) {
                        nameNewBookButton = " " + bookArrayList.get(i).author;
                    } else {
                        nameNewBookButton = " " + bookArrayList.get(i).author.charAt(0) + bookArrayList.get(i).author.charAt(1)
                                + bookArrayList.get(i).author.charAt(2) + bookArrayList.get(i).author.charAt(3)
                                + bookArrayList.get(i).author.charAt(4) + bookArrayList.get(i).author.charAt(5)
                                + bookArrayList.get(i).author.charAt(6) + bookArrayList.get(i).author.charAt(7)
                                + bookArrayList.get(i).author.charAt(8) + bookArrayList.get(i).author.charAt(9)
                                + bookArrayList.get(i).author.charAt(10) + bookArrayList.get(i).author.charAt(11)
                                + bookArrayList.get(i).author.charAt(12) + bookArrayList.get(i).author.charAt(13)
                                + bookArrayList.get(i).author.charAt(14) + bookArrayList.get(i).author.charAt(15)
                                + bookArrayList.get(i).author.charAt(16) + bookArrayList.get(i).author.charAt(17)
                                + bookArrayList.get(i).author.charAt(18) + bookArrayList.get(i).author.charAt(19) + " .";

                    }

                    if (bookArrayList.get(i).name.length() < 20 || (Objects.equals(bookArrayList.get(i).author, "- ") && (bookArrayList.get(i).name.length() < 40))) {
                        nameNewBookButton = nameNewBookButton + "  " + bookArrayList.get(i).name + " ";
                    } else if (Objects.equals(bookArrayList.get(i).author, "- ")) {
                        nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                                + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                                + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                                + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                                + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                                + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                                + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                                + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                                + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                                + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19)
                                + bookArrayList.get(i).name.charAt(20) + bookArrayList.get(i).name.charAt(21)
                                + bookArrayList.get(i).name.charAt(22) + bookArrayList.get(i).name.charAt(23)
                                + bookArrayList.get(i).name.charAt(24) + bookArrayList.get(i).name.charAt(25)
                                + bookArrayList.get(i).name.charAt(26) + bookArrayList.get(i).name.charAt(27)
                                + bookArrayList.get(i).name.charAt(28) + bookArrayList.get(i).name.charAt(29)
                                + bookArrayList.get(i).name.charAt(30) + bookArrayList.get(i).name.charAt(31)
                                + bookArrayList.get(i).name.charAt(32) + bookArrayList.get(i).name.charAt(33)
                                + bookArrayList.get(i).name.charAt(34) + bookArrayList.get(i).name.charAt(35)
                                + bookArrayList.get(i).name.charAt(36) + bookArrayList.get(i).name.charAt(37)
                                + bookArrayList.get(i).name.charAt(38) + " ";

                    } else {
                        nameNewBookButton = nameNewBookButton + " " + bookArrayList.get(i).name.charAt(0) + bookArrayList.get(i).name.charAt(1)
                                + bookArrayList.get(i).name.charAt(2) + bookArrayList.get(i).name.charAt(3)
                                + bookArrayList.get(i).name.charAt(4) + bookArrayList.get(i).name.charAt(5)
                                + bookArrayList.get(i).name.charAt(6) + bookArrayList.get(i).name.charAt(7)
                                + bookArrayList.get(i).name.charAt(8) + bookArrayList.get(i).name.charAt(9)
                                + bookArrayList.get(i).name.charAt(10) + bookArrayList.get(i).name.charAt(11)
                                + bookArrayList.get(i).name.charAt(12) + bookArrayList.get(i).name.charAt(13)
                                + bookArrayList.get(i).name.charAt(14) + bookArrayList.get(i).name.charAt(15)
                                + bookArrayList.get(i).name.charAt(16) + bookArrayList.get(i).name.charAt(17)
                                + bookArrayList.get(i).name.charAt(18) + bookArrayList.get(i).name.charAt(19) + " ";
                    }

                    newBookAdded = new TextButton(nameNewBookButton, skinTree);
                    newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                    newBookAdded.addListener(new ChangeListener() {
                        @Override
                        public void changed(ChangeEvent event, Actor actor) {
                            for (int i = 0; i < bookArrayList.size(); i++) {
                                if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                    index = i;
                                    readerThisBookUpdate(bookArrayList.get(i));
                                    chooseObject = true;
                                    bookNumber = 0;
                                    bookNumberOfHend = 0;
                                    for (int j = 0; j < bookArrayList.size(); j++) {
                                        if ((bookArrayList.get(j).name.equals(bookArrayList.get(index).name)) && (bookArrayList.get(j).genre.equals(bookArrayList.get(index).genre)) && ((bookArrayList.get(j).author.equals(bookArrayList.get(index).author)))) {
                                            bookNumber++;
                                            if (bookArrayList.get(j).dataOfGiven == null) {
                                                bookNumberOfHend++;
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    });
                    allBookScrollPaneTable.add(newBookAdded).pad(2).row();
                }
            }
        }

    }

    public void readerThisBookUpdate(Book thisBook) {
        readerBookArrey.clear();

        for (Book book : bookArrayList) {
            if (book.reader != null) {
                if ((book.name + book.author + book.genre).equals(thisBook.name + thisBook.author + thisBook.genre)) {

                    readerBookArrey.add(" " + book.reader.surname + " " + book.reader.name);
                }
            }
        }
        readerThisBook.setItems(readerBookArrey);
    }

    public void allReaderListUpdate() {
        Collections.sort(readersArrayList, new Comparator<Readers>() {
            public int compare(Readers o1, Readers o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(readersArrayList, new Comparator<Readers>() {
            public int compare(Readers o1, Readers o2) {
                return o1.surname.compareTo(o2.surname);
            }
        });

        allReaderScrollPaneTable.clear();


        for (int i = 0; i < readersArrayList.size(); i++) {


            if (((nameReaderSearch.getText().equals("")) || (readersArrayList.get(i).name.contains(nameReaderSearch.getText())))
                    && ((surnameReaderSearch.getText().equals("")) || (readersArrayList.get(i).surname.contains(surnameReaderSearch.getText())))
                    && ((yearsSearch.getSelectedIndex() == 0) || (((readersArrayList.get(i).yearsLern + " класс").equals(yearsSearch.getSelected()) && (readersArrayList.get(i).yearsLern < 12)) || (((" Сотрудники").equals(yearsSearch.getSelected()))) && (readersArrayList.get(i).yearsLern > 11)))
                    && ((yearsCharSearch.getSelectedIndex() == 0) || (readersArrayList.get(i).charClass.equals(yearsCharSearch.getSelected())))) {

                if (readersArrayList.get(i).yearsLern >= 12) {
                    newReaderAdded = new TextButton(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " Cотрудник", skinTree);

                } else {
                    newReaderAdded = new TextButton(" " + readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass + " ", skinTree);
                }
                newReaderAdded.setName(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass);
                newReaderAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        for (int i = 0; i < readersArrayList.size(); i++) {
                            if ((readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass).equals(actor.getName())) {
                                index = i;
                                WhatBookHeHave(readersArrayList.get(i));
                                bookThisReader.setItems(textFieldBooks);
                                chooseObject = true;
                            }
                        }
                    }
                });
                allReaderScrollPaneTable.add(newReaderAdded).pad(2).size(newReaderAdded.getWidth(), newReaderAdded.getHeight()).row();
            }
        }
    }

    public void WhatBookHeHave(Readers readers2) {

        textFieldBooks.clear();
        for (Book book : bookArrayList) {
            try {
                if (book.reader.equals(readers2)) {


                    if (book.author.length() < 10) {
                        nameNewBookButton = " " + book.author;
                    } else {
                        nameNewBookButton = " " + book.author.charAt(0) + book.author.charAt(1)
                                + book.author.charAt(2) + book.author.charAt(3)
                                + book.author.charAt(4) + book.author.charAt(5)
                                + book.author.charAt(6) + book.author.charAt(7)
                                + book.author.charAt(8) + book.author.charAt(9) + " .";

                    }

                    if (book.name.length() < 10 || (Objects.equals(book.author, "- ") && (book.name.length() < 20))) {
                        nameNewBookButton = nameNewBookButton + "  " + book.name + " ";
                    } else if (Objects.equals(book.author, "- ")) {
                        nameNewBookButton = nameNewBookButton + " " + book.name.charAt(0) + book.name.charAt(1)
                                + book.name.charAt(2) + book.name.charAt(3)
                                + book.name.charAt(4) + book.name.charAt(5)
                                + book.name.charAt(6) + book.name.charAt(7)
                                + book.name.charAt(8) + book.name.charAt(9)
                                + book.name.charAt(10) + book.name.charAt(11)
                                + book.name.charAt(12) + book.name.charAt(13)
                                + book.name.charAt(14) + book.name.charAt(15)
                                + book.name.charAt(16) + book.name.charAt(17)
                                + book.name.charAt(18) + book.name.charAt(19) + " ";

                    } else {
                        nameNewBookButton = nameNewBookButton + " " + book.name.charAt(0) + book.name.charAt(1)
                                + book.name.charAt(2) + book.name.charAt(3)
                                + book.name.charAt(4) + book.name.charAt(5)
                                + book.name.charAt(6) + book.name.charAt(7)
                                + book.name.charAt(8) + book.name.charAt(9) + " ";
                    }


                    textFieldBooks.add(nameNewBookButton);
                }
            } catch (NullPointerException e) {
            }
        }
        bookOnReaderTable.clear();
        bookOnReaderTable.add(bookThisReaderPreName).pad(2);
        bookOnReaderTable.add(bookThisReader).pad(2, 2, 2, 2).size(150, 50);
    }

    public void WhatBookHeHaveDolg(Readers readers2) {

        textFieldBooks.clear();
        for (Book book : bookArrayList) {
            try {
                if (book.reader.equals(readers2)) {

                    textFieldBooks.add((" " + book.author + " " + book.name + " " + book.dataOfGiven.getTime().getDate()
                            + "." + (book.dataOfGiven.getTime().getMonth() + 1) + "." + book.dataOfGiven.getWeekYear()));
                }
            } catch (NullPointerException e) {
            }
        }
        bookOnReaderTable.clear();
        bookOnReaderTable.add(bookThisReaderPreName).pad(2);
        bookOnReaderTable.add(bookThisReader).pad(2, 65, 2, 2).fill(1.8f, 1);
    }

    public void newReaderMenu() {
        newReaderTable.setFillParent(true);
        newReaderTable.setPosition(0, 0);


        nameReader = new TextField("", skinTree);
        nameReader.setMessageText(" Имя нового читателя");
        surnameReader = new TextField("", skinTree);
        surnameReader.setMessageText(" Фамилия нового читателя");
        patronymicReader = new TextField("", skinTree);
        patronymicReader.setMessageText(" Отчество нового читателя");
        classReader = new SelectBox(skinTree);
        classReader.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудники");
        charClass = new TextField("", skinTree);
        charClass.setMessageText(" Введите букву класса");
        errorNewReader = new TextField(" Заполните обязательные поля", skinTree);
        errorNewReader.setDisabled(true);
        errorNewReader.setColor(Color.RED);
        addNewReader = new TextButton(" Добавить", skinTree);

        newReaderTable.add(surnameReader).size(350, 30).pad(2).row();
        newReaderTable.add(nameReader).size(350, 30).pad(2).row();
        newReaderTable.add(patronymicReader).size(350, 30).pad(2).row();
        newReaderTable.add(classReader).size(350, 30).pad(2).row();
        newReaderTable.add(charClass).size(350, 30).pad(2).row();
        newReaderTable.add(addNewReader).pad(2).row();

        addNewReader.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                nameReader.setColor(Color.WHITE);
                surnameReader.setColor(Color.WHITE);
                patronymicReader.setColor(Color.WHITE);

                if ((nameReader.getText().equals("")) || (surnameReader.getText().equals("")) || (patronymicReader.getText().equals(""))) {
                    if ((nameReader.getText().equals(""))) {
                        nameReader.setColor(Color.RED);
                    }
                    if ((surnameReader.getText().equals(""))) {
                        surnameReader.setColor(Color.RED);
                    }
                    if ((patronymicReader.getText().equals(""))) {
                        patronymicReader.setColor(Color.RED);
                    }

                    newReaderTable.add(errorNewReader).fillX();

                } else {

                    if (charClass.getText().equals("")) {
                        readersArrayList.add(new Readers(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, "a"));
                        Library.saveNewReader(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, "a");
                        if (classReader.getSelectedIndex() > 10) {
                            logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + " сотрудник");

                        } else {
                            logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + " " + classReader.getSelectedIndex() + 1 + " " + "a");
                        }
                    } else
                        readersArrayList.add(new Readers(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, charClass.getText()));
                    Library.saveNewReader(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, charClass.getText());

                    if (classReader.getSelectedIndex() > 10) {
                        logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + " сотрудник");

                    } else {
                        logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + " " + classReader.getSelectedIndex() + 1 + " " + charClass.getText());
                    }
                    newReaderTable.clear();
                    newReaderTable.add(surnameReader).size(350, 30).pad(2).row();
                    newReaderTable.add(nameReader).size(350, 30).pad(2).row();
                    newReaderTable.add(patronymicReader).size(350, 30).pad(2).row();
                    newReaderTable.add(classReader).size(350, 30).pad(2).row();
                    newReaderTable.add(charClass).size(350, 30).pad(2).row();
                    newReaderTable.add(addNewReader).pad(2).row();
                    stage.clear();
                    meinMenuUsed();
                    stage.addActor(mainMenuTable);
                    stage.addActor(tableListAllBook);
                    stage.addActor(searchMenuBookTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(readerThisBookTable);
                    getAuthorForSearch();
                    bookMenuTipNow = 0;
                    stage.addActor(infoMenuTable);
                    stage.addActor(descriptionInfoTable);
                    stage.addActor(deleteTable);
                    infoMenuTip = 1;

                    deleteTable.clear();
                    deleteTable.setPosition(740, 180);
                    deleteTable.add(redactButton).pad(2).row();
                    deleteTable.add(deleteButton);
                    allBookListUpdate();
                    readerNumber.setText(" " + readersArrayList.size());

                }


            }
        });

    }

    public void giveBookMenu() {

        giveBookButtonTable.setFillParent(true);
        giveBookButtonTable.setPosition(0, -Gdx.graphics.getHeight() / 4);
        giveBookButton = new TextButton("Выдать книгу", skinTree);
        giveBookButtonTable.add(giveBookButton);
        erorTextField = new TextField("", skinTree);
        erorTextField.setDisabled(true);
        giveBookButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if ((bookOnGivMenuTable.getRows() == 3) && (readersOnGivMenuTable.getRows() == 3)) {
                    for (Book book : bookArrayList) {

                        if ((book.author.equals(authorOfBookOnGivMenuSelectBox.getSelected())) &&
                                (book.name.equals(nameOfBookOnGivMenuSelectBox.getSelected())) &&
                                (book.genre.equals(genreOfBookOnGivMenuSelectBox.getSelected())) &&
                                (book.dataOfGiven == null)) {
                            for (Readers value : readersArrayList) {

if (classOfReadersOnGivMenuSelectBox.getSelectedIndex() >10){
    if ((value.surname + " " + value.name  + value.yearsLern)
            .equals(surnameOfReadersOnGivMenuSelectBox.getSelected() +
                    "" +
                    (int) (classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1))) {
        book.giveBook(value);
        System.out.println();
        if (value.yearsLern > 11) {
            logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + " " + book.name + " выдана " + value.surname + " " + value.name + " сотрудник");

        } else {
            logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + " " + book.name + " выдана " + value.surname + " " + value.name + " " + value.yearsLern + " " + value.charClass);

        }

        Library.saveBookGiver(bookArrayList.indexOf(book), book.dataOfGiven.getWeekYear(), book.dataOfGiven.getTime().getMonth()
                , book.dataOfGiven.getTime().getDate(), value.name, value.surname, value.patronymic, value.yearsLern, value.charClass);


        break;
    }
}else if ((value.surname + " " + value.name + value.charClass + value.yearsLern)
                                        .equals(surnameOfReadersOnGivMenuSelectBox.getSelected() +
                                                (String) charClassGivMenu.getSelected() +
                                                (int) (classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1))) {
                                    book.giveBook(value);
                                    System.out.println();
                                    if (value.yearsLern > 11) {
                                        logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + " " + book.name + " выдана " + value.surname + " " + value.name + " сотрудник");

                                    } else {
                                        logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + " " + book.name + " выдана " + value.surname + " " + value.name + " " + value.yearsLern + " " + value.charClass);

                                    }

                                    Library.saveBookGiver(bookArrayList.indexOf(book), book.dataOfGiven.getWeekYear(), book.dataOfGiven.getTime().getMonth()
                                            , book.dataOfGiven.getTime().getDate(), value.name, value.surname, value.patronymic, value.yearsLern, value.charClass);


                                    break;
                                }
                            }

                            bookOnHendNumberInt++;
                            stage.clear();
                            meinMenuUsed();
                            stage.addActor(mainMenuTable);
                            stage.addActor(tableListAllBook);
                            stage.addActor(numberAllBookTable);
                            stage.addActor(readerThisBookTable);
                            getAuthorForSearch();
                            bookMenuTipNow = 0;
                            stage.addActor(infoMenuTable);
                            stage.addActor(searchMenuBookTable);
                            stage.addActor(descriptionInfoTable);
                            stage.addActor(deleteTable);
                            infoMenuTip = 1;
                            deleteTable.clear();
                            deleteTable.setPosition(740, 180);
                            deleteTable.add(redactButton).pad(2).row();
                            deleteTable.add(deleteButton);
                            allBookScrollPaneTable.clear();
                            bookOnLibrary.setText(" " + (numberOfBook - bookOnHendNumberInt));
                            bookOnHendNumber.setText(" " + bookOnHendNumberInt);
                            allBookOnMyHendListUpdate();

                            break;
                        } else {
                            stage.clear();
                            stage.addActor(mainMenuTable);
                            stage.addActor(numberAllBookTable);
                            stage.addActor(giveBookButtonTable);
                            stage.addActor(readersOnGivMenuTable);
                            stage.addActor(bookOnGivMenuTable);
                            erorTextField.setText(" " + "Все книги на руках");
                            erorTextField.setColor(Color.RED);
                            erorTextField.setWidth(335);
                            erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - erorTextField.getWidth() / 2, 20);
                            stage.addActor(erorTextField);
                        }
                    }


                } else {
                    stage.clear();
                    stage.addActor(mainMenuTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(giveBookButtonTable);
                    stage.addActor(readersOnGivMenuTable);
                    stage.addActor(bookOnGivMenuTable);
                    erorTextField.setText(" " + "Выберите книгу и ученика");
                    erorTextField.setColor(Color.RED);
                    erorTextField.setWidth(335);
                    erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - erorTextField.getWidth() / 2, 20);
                    stage.addActor(erorTextField);
                }

            }
        });
        bookOnGivMenuTable.setFillParent(true);
        bookOnGivMenuTable.setPosition(-Gdx.graphics.getWidth() / 4 - 10, 0);
        genreOfBookOnGivMenuSelectBox = new SelectBox(skinTree);
        authorOfBookOnGivMenuSelectBox = new SelectBox(skinTree);
        nameOfBookOnGivMenuSelectBox = new SelectBox(skinTree);
        genreOfBookOnGivMenuSelectBox.setItems(" Неопределенный жанр", " Учебники", " Классика", " Детская литература", " Справочная литература", " Зарубежная литература");
        bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox).pad(2).row();
        authorOfBookOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                getBookNameByAuthor((String) authorOfBookOnGivMenuSelectBox.getSelected(), genreOfBookOnGivMenuSelectBox.getSelected());
                nameOfBookOnGivMenuSelectBox.setItems(nameOfBookOnGivMenuArrayList.toArray());
                bookOnGivMenuTable.clear();
                bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox).pad(2).row();
                bookOnGivMenuTable.add(authorOfBookOnGivMenuSelectBox).pad(2).size(150, 50).row();
                bookOnGivMenuTable.add(nameOfBookOnGivMenuSelectBox).pad(2).size(150, 50).row();
            }
        });

        genreOfBookOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                getBookAuthorByGenre((String) genreOfBookOnGivMenuSelectBox.getSelected());
                authorOfBookOnGivMenuSelectBox.setItems(authorOfBookOnGivMenuArrayList.toArray());
                bookOnGivMenuTable.clear();
                bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox).pad(2).row();
                bookOnGivMenuTable.add(authorOfBookOnGivMenuSelectBox).pad(2).size(150, 50).row();

            }
        });

        charClassGivMenu = new SelectBox(skinTree);
        readersOnGivMenuTable.setFillParent(true);
        readersOnGivMenuTable.setPosition(Gdx.graphics.getWidth() / 4 + 10, 0);
        classOfReadersOnGivMenuSelectBox = new SelectBox(skinTree);
        surnameOfReadersOnGivMenuSelectBox = new SelectBox(skinTree);


        classOfReadersOnGivMenuSelectBox.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудники");

        readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
        classOfReadersOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                charOfClassByYears(classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1);
                charClassGivMenu.setItems(charOfClassArray);

                readersOnGivMenuTable.clear();

                readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                if (classOfReadersOnGivMenuSelectBox.getSelectedIndex()==11){
                    getReadersSurnameByClass(classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1, "");
                    surnameOfReadersOnGivMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());

                    readersOnGivMenuTable.clear();

                    readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                    readersOnGivMenuTable.add().row();
                    readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();
                }else {
                    readersOnGivMenuTable.add(charClassGivMenu).pad(2).row();
                }
            }
        });
        charClassGivMenu.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                getReadersSurnameByClass(classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1, (String) charClassGivMenu.getSelected());
                surnameOfReadersOnGivMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());

                readersOnGivMenuTable.clear();

                readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                readersOnGivMenuTable.add(charClassGivMenu).pad(2).row();
                readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();

            }
        });

        surnameOfReadersOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (classOfReadersOnGivMenuSelectBox.getSelectedIndex()==11){
                    readersOnGivMenuTable.clear();
                    readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                    readersOnGivMenuTable.add().row();
                    readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();
                }else {
                    readersOnGivMenuTable.clear();
                    readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                    readersOnGivMenuTable.add(charClassGivMenu).pad(2).row();
                    readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();
                }
            }
        });


    }

    private void charOfClassByYears(int i) {
        charOfClassArray.clear();
        for (Readers readers1 : readersArrayList) {

            if (readers1.yearsLern == i) {
                if (!charOfClassArray.contains(readers1.charClass, false))
                    charOfClassArray.add(readers1.charClass);
            }
        }
    }

    private void getBookNameByAuthor(String author, Object genre) {
        nameOfBookOnGivMenuArrayList.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).genre.equals(genre)) {
                if (bookArrayList.get(i).author.equals(author)) {
                    haveBoolean = true;
                    for (int i1 = 0; i1 < nameOfBookOnGivMenuArrayList.size(); i1++) {
                        if (nameOfBookOnGivMenuArrayList.get(i1).equals(bookArrayList.get(i).name)) {
                            haveBoolean = false;
                        }

                    }
                    if (haveBoolean) {
                        nameOfBookOnGivMenuArrayList.add(bookArrayList.get(i).name);
                    }

                }
            }
        }
    }

    public void getReadersSurnameByClass(int yearsLern, String charClass) {
        surnameOfReadersOnGivMenuArrayList.clear();
        for (int i = 0; i < readersArrayList.size(); i++) {
            if ((readersArrayList.get(i).yearsLern == yearsLern) && (readersArrayList.get(i).charClass.contains(charClass))) {
                nameAdded = false;
                for (int i1 = 0; i1 < surnameOfReadersOnGivMenuArrayList.size(); i1++) {

                    if (
                            surnameOfReadersOnGivMenuArrayList.get(i1).equals(readersArrayList.get(i).surname)) {
                        nameAdded = true;
                    }
                }
                if (!nameAdded) {
                    surnameOfReadersOnGivMenuArrayList.add(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name);
                }
            }
        }
    }


    public void getBookAuthorByGenre(String genre) {
        authorOfBookOnGivMenuArrayList.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).genre.equals(genre)) {
                authorAdded = false;
                for (int i1 = 0; i1 < authorOfBookOnGivMenuArrayList.size(); i1++) {
                    if (bookArrayList.get(i).author.equals(authorOfBookOnGivMenuArrayList.get(i1))) {
                        authorAdded = true;
                    }
                    ;
                }

                if (!authorAdded) {
                    authorOfBookOnGivMenuArrayList.add(bookArrayList.get(i).author);
                }
            }
        }
    }


    public void returnBookMenu() {
        returnMenuTable.setFillParent(true);
        returnMenuTable.setPosition(0, 0);

        classOfReadersOnReturnMenuSelectBox = new SelectBox(skinTree);
        surnameOfReadersOnReturnMenuSelectBox = new SelectBox(skinTree);
        bookOnReturnMenuSelectBox = new SelectBox(skinTree);
        returnBookButton = new TextButton("Вернуть книгу", skinTree);
        classOfReadersOnReturnMenuSelectBox.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудники");

        returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
        charClassReturnMenu = new SelectBox(skinTree);

        classOfReadersOnReturnMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                charOfClassByYears(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1);

                returnMenuTable.clear();
                returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
if (classOfReadersOnReturnMenuSelectBox.getSelectedIndex()==11){
    getReadersSurnameByClass(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1, "");
    surnameOfReadersOnReturnMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
    returnMenuTable.clear();
    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
    returnMenuTable.add().row();
    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
}else {
    charClassReturnMenu.setItems(charOfClassArray);
    returnMenuTable.add(charClassReturnMenu).pad(2).row();
}

            }
        });

        charClassReturnMenu.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                getReadersSurnameByClass(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1, (String) charClassReturnMenu.getSelected());
                surnameOfReadersOnReturnMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
                returnMenuTable.clear();
                returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                returnMenuTable.add(charClassReturnMenu).pad(2).row();
                returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
            }
        });


        surnameOfReadersOnReturnMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (classOfReadersOnReturnMenuSelectBox.getSelectedIndex()==11){
                    getBookByName(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1,
                            (String) surnameOfReadersOnReturnMenuSelectBox.getSelected(), "");
                    bookOnReturnMenuSelectBox.setItems(bookReturnArrayList.toArray());
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add().row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).size(150, 50).row();
                }else {
                    getBookByName(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1,
                            (String) surnameOfReadersOnReturnMenuSelectBox.getSelected(), (String) charClassReturnMenu.getSelected());
                    bookOnReturnMenuSelectBox.setItems(bookReturnArrayList.toArray());
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(charClassReturnMenu).pad(2).row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).size(150, 50).row();
                }




            }
        });
        bookOnReturnMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (classOfReadersOnReturnMenuSelectBox.getSelectedIndex()==11){
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add( ).row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).size(150, 50).row();
                    returnMenuTable.add(returnBookButton).pad(2).row();
                }else {
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(charClassReturnMenu).pad(2).row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).size(150, 50).row();
                    returnMenuTable.add(returnBookButton).pad(2).row();
                }

            }


        });
        returnBookButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                for (Readers reader : readersArrayList) {
                    if (((reader.surname + " " + reader.name).equals(surnameOfReadersOnReturnMenuSelectBox.getSelected())) &&
                            (reader.yearsLern == classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1) &&
                            ((reader.charClass.equals(charClassReturnMenu.getSelected()))||classOfReadersOnReturnMenuSelectBox.getSelectedIndex()>=11)) {
                        for (Book book : bookArrayList) {

                            if ((((book.author + " " + book.name).equals(bookOnReturnMenuSelectBox.getSelected()))) && (book.giveThisReader(reader))) {
                                if (reader.yearsLern > 11) {
                                    logNewString((new GregorianCalendar()).getTime() + " книгу:" + book.author + " " + book.name + " вернул " + reader.surname + " " + reader.name + " сотрудник");

                                } else {
                                    logNewString((new GregorianCalendar()).getTime() + " книгу:" + book.author + " " + book.name + " вернул " + reader.surname + " " + reader.name + " " + reader.yearsLern + " " + reader.charClass);
                                }

                                stage.clear();
                                meinMenuUsed();
                                stage.addActor(mainMenuTable);
                                stage.addActor(tableListAllBook);
                                stage.addActor(numberAllBookTable);
                                getAuthorForSearch();
                                bookMenuTipNow = 0;
                                stage.addActor(readerThisBookTable);
                                stage.addActor(infoMenuTable);
                                stage.addActor(searchMenuBookTable);
                                stage.addActor(descriptionInfoTable);
                                stage.addActor(deleteTable);
                                infoMenuTip = 1;

                                bookOnHendNumberInt--;
                                deleteTable.clear();
                                deleteTable.setPosition(740, 180);
                                deleteTable.add(redactButton).pad(2).row();
                                deleteTable.add(deleteButton);
                                allBookListUpdate();
                                book.returnBook();
                                Library.saveBookReturn(bookArrayList.indexOf(book));
                                bookOnHendNumber.setText(" " + bookOnHendNumberInt);
                                bookOnLibrary.setText(" " + (numberOfBook - bookOnHendNumberInt));
                                break;
                            }

                        }


                        break;
                    }

                }
            }
        });


    }

    public void getBookByName(int age, String selected, String charOfClass) {
        bookReturnArrayList.clear();
        for (Readers reader : readersArrayList) {
            if (((reader.surname + " " + reader.name).equals(selected)) && (reader.yearsLern == age) && (reader.charClass.contains(charOfClass))) {
                for (Book book : bookArrayList) {

                    if (book.giveThisReader(reader)) {
                        bookReturnArrayList.add(book.author + " " + book.name);
                    }

                }


                break;
            }

        }
    }


}