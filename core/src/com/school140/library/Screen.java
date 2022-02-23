package com.school140.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

// TODO: 09.02.2022  при нажатии на книгу считывается ее название (button name) являюшийся id

public class Screen {
    boolean saveRedactBoolean = true;
    static Boolean BookArrayOnThreed=false;
    boolean bookDetected;
    static String nameNewBookButton;
    static Skin skinTree;
    XSSFWorkbook workbook;
    Cell cell;
    Row row;
    XSSFSheet sheet;
    XSSFCellStyle style;

    Array<String> charOfClassArray = new Array<>();
    static String descriptionString;
    static Stage stage;
    Label reportСompleted;
    ScrollPane allBookScrollPane;
    ScrollPane descriptionScrollPane;
    static Table descriptionInfoTable = new Table();
    boolean coverReal;
    List allReaderList;
    static Label saveError;
    String reportName;
    boolean errorRedact = false;
    SelectBox reportYearsName;
    SelectBox reportCharName;
    SelectBox reportNameName;
    SelectBox reportAuthorBook;
    SelectBox reportNameBook;
    SelectBox reportGenreBook;
    Table reportBookTable = new Table();
    TextButton reportBook;
    static public int bookNumber;
    static public int bookNumberOfHend;
    Table redactBook = new Table();
    TextField bookAuthorRedact;
    TextField bookNameRedact;
    TextField bookDescriptionRedact;
    TextField bookCoverRedact;
    SelectBox bookGenreRedact;
    static TextButton report;
    int rownum = 0;
    TextField reportString;
    TextButton reportAll;
    TextButton reportGivReturn;
    TextButton reportNull;
    TextButton reportOnName;
    static boolean authorThisTable;
    static GregorianCalendar dataOfNewClass;
    // TODO: 20.09.2021  не пиратьте пожалуйста
    static GregorianCalendar nowData;
    static int index = -1;
    static Table mainMenuTable = new Table();
    static Table numberAllBookTable = new Table();
    static TextField numberAllBook;
    static Table infoMenuTable = new Table();
    static Table allBookScrollPaneTable = new Table();
    static Table tableListAllBook = new Table();
    Table bookOnGivMenuTable = new Table();
    Table readersOnGivMenuTable = new Table();
    Table tableListAllReader = new Table();
    Table newBookTable = new Table();
    Table addNewBookTable = new Table();
    Table newReaderTable = new Table();
    Table returnMenuTable = new Table();
    Table descriptionTable = new Table();
    Table bookOnReaderTable = new Table();
    static TextButton newBookAdded;
    static TextButton newBook;
    static TextButton newReader;
    boolean noNullPointerException = true;


    boolean noError = true;
    static TextButton giveBook;
    static TextButton returnBook;
    static TextButton dolg;
    static TextButton allBook;
    static TextButton myBook;
    static TextButton onHands;
    static TextButton readers;
    Array<String> textFieldBooks = new Array<>();
    static int bookMenuTipNow = 0;
    static Label error;

    Boolean delrep = true;
    ArrayList<String> reportBookStr = new ArrayList<>();
    ArrayList<String> reportBookStr2 = new ArrayList<>();
    static TextField nameBook;
    static int infoMenuTip = 1;
    static boolean authorAdded;
    Boolean reportOnNameOn = false;
    static TextField authorWindow;
    static TextField nameBookWindow;
    static TextField numberWindow;
    static Texture imageWindow;
    static TextField genreWindow;
    Boolean allBookBoolean = true;
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
    static Array<String> readerBookArrey = new Array<>();
    Table errorDelTable = new Table();
    Label errorDelLabel;
    int scet;
    static SelectBox genreOfBookOnGivMenuSelectBox;
    static SelectBox bookOnReturnMenuSelectBox;
    static SelectBox authorOfBookOnGivMenuSelectBox;
    static SelectBox nameOfBookOnGivMenuSelectBox;
    String text = "";
    static SelectBox classOfReadersOnGivMenuSelectBox;
    static SelectBox surnameOfReadersOnGivMenuSelectBox;
    static SelectBox classOfReadersOnReturnMenuSelectBox;
    static SelectBox surnameOfReadersOnReturnMenuSelectBox;
    static SelectBox charClassGivMenu;
    static SelectBox charClassReturnMenu;
    static TextField charClass;
    static Table searchMenuBookTable = new Table();
    static SelectBox genreSearch;
    static SelectBox authorSearch;
    static TextField nameBookSearch;
    Table searchMenuReaderTable = new Table();
    SelectBox yearsSearch;
    SelectBox yearsCharSearch;
    TextField nameReaderSearch;
    TextField surnameReaderSearch;
    static Table giveBookButtonTable = new Table();
    static TextButton giveBookButton;
    static TextButton giveBookKlassButton;
    TextButton deleteButton;
    Table deleteTable = new Table();
    static Boolean chooseObject = false;
    static ArrayList<String> authorOfBookOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> nameOfBookOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> surnameOfReadersOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> bookReturnArrayList = new ArrayList<>();
    TextButton returnBookButton;
    static Table readerThisBookTable = new Table();
    SelectBox dolgBook;
    Table dolgBookTable = new Table();
    static TextField numberBookOfHendWindow;
    static TextField nameReaderWindow;
    static TextField surnameReaderWindow;
    static String lastButtonName = "";
    static TextField patronymicReaderWindow;
    static TextField classReaderWindow;
    static boolean bookExclusive;
    TextField errorNewReader;
    TextField nameReader;
    TextField surnameReader;
    TextField patronymicReader;
    SelectBox classReader;
    static SelectBox readerThisBook;
    static SelectBox bookThisReader;
    TextField readerThisBookPreName;
    TextField bookThisReaderPreName;
    TextButton addNewReader;
    static TextField author;
    static TextField number;
    static Array<String> authorForSerch = new Array();
    Array<String> yearsForSerch = new Array();
    Array<String> charForSerch = new Array();
    TextField pathToImage;
    TextButton exit;
    static SelectBox genre;
    ArrayList<String> reportArray=new ArrayList<>();
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
    Table reportTable = new Table();
    static String coverBook;
    public static ArrayList<Book> bookArrayList = new ArrayList<>();
    static ArrayList<Readers> readersArrayList = new ArrayList<>();
    Table allReaderScrollPaneTable = new Table();
    ScrollPane allReaderScrollPane;
    TextButton newReaderAdded;
    boolean haveBoolean;
    Table descriptionWindowTable2;
    static int genre1 = 0;
    static int genre2 = 0;
    static int genre3 = 0;
    Table StringErrorReportTable = new Table();
    String pathReport = "";
    static int genre4 = 0;
    static int genre5 = 0;
    int bookReportInt;
    TextButton saveButton;
    int numberRedactMinusBook = 0;
    Table readersOnReportMenuTable = new Table();
    boolean intNormRedact;

    public Screen() {

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Employees sheet");
        style = createStyleForTitle(workbook);
        skinTree = new Skin(Gdx.files.internal("TreeButton/treeSkin3.json"));


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


    }

    private XSSFCellStyle createStyleForTitle(XSSFWorkbook workbook) {
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        XSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    private void redactMenu() {
        redactBook.setFillParent(true);
        numberBookRedact = new TextField("", skinTree);

        numberBookRedact.getStyle().background.setLeftWidth(10);
        numberBookRedact.getStyle().background.setRightWidth(10);
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
                intNormRedact = true;
                try {
                    Integer.parseInt(numberBookRedact.getText());
                    if (Integer.parseInt(numberBookRedact.getText()) < 0 || Integer.parseInt(numberBookRedact.getText()) > 1000) {
                        Integer.parseInt("i");

                    }
                } catch (NumberFormatException e) {
                    intNormRedact = false;
                }
                if (intNormRedact) {
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

                            bookArrayList.add(new Book(bookNameRedact.getText(), bookAuthorRedact.getText(),
                                    String.valueOf(bookGenreRedact.getSelected()), descriptionString, bookCoverRedact.getText()));
                        }

                        if ((Integer.parseInt(numberBookRedact.getText()) - numberThisBook)>0) {
                            logNewString((new GregorianCalendar()).getTime() + " новая книга " + bookNameRedact.getText() + "///" +
                                    bookAuthorRedact.getText() + "///" + bookGenreRedact.getSelected()
                                    + " в количестве" + (Integer.parseInt(numberBookRedact.getText()) - numberThisBook) + " штук");
                            numberAllBook.setText(" " + bookArrayList.size());
                            bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));

                        }
                    } else if (numberThisBook > Integer.parseInt(numberBookRedact.getText())) {
                        numberRedactMinusBook = 0;
                         for (int i = 0; i < bookArrayList.size() - numberRedactMinusBook; i++) {

                            if (redactSave.equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre) && (bookArrayList.get(i).reader == null)) {
                                if (numberThisBook - Integer.parseInt(numberBookRedact.getText()) - numberRedactMinusBook != 0) {
                                    logNewString((new GregorianCalendar()).getTime()+ " книга удалена "
                                            + bookArrayList.get(i).author +"///" + bookArrayList.get(i).name);
                                    bookArrayList.remove(i);
                                    numberRedactMinusBook++;
                                    i--;
                                }
                            }
                        }
                        numberAllBook.setText(" " + bookArrayList.size());
                        bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));

                        errorRedact = false;
                        if (numberRedactMinusBook != numberThisBook - Integer.parseInt(numberBookRedact.getText())) {
                            errorDelLabel.setText(" Не все книги были удалены, \n часть из них выданна");


                            errorRedact = true;
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
                     saveRedactBoolean = true;
                    for (Book book : bookArrayList) {


                        if (redactSave.equals(book.name + book.author + book.genre)) {
                            if (saveRedactBoolean){
                                logNewString((new GregorianCalendar()).getTime() + " измеенена книга" + bookNameRedact.getText() + "///" +
                                        bookAuthorRedact.getText() + "///" + bookGenreRedact.getSelected()
                                        + "///"+ book.author + "-->"+ bookAuthorRedact.getText() + ";"+
                                book.name  + "-->"+bookNameRedact.getText()+ ";"+
                                book.genre  + "-->"+String.valueOf(bookGenreRedact.getSelected())+ ";");
                                saveRedactBoolean=false;
                            }

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
                    if (errorRedact) {
                        stage.addActor(errorDelTable);
                    }
                    descriptionWindow.setText("Описание");
                    stage.addActor(descriptionInfoTable);
                    stage.addActor(infoMenuTable);
                    infoMenuTip = 1;
                    stage.addActor(deleteTable);
                    meinMenuUsed();
                    allBook.setColor(Color.RED);
                    getAuthorForSearch();
                    bookMenuTipNow = 0;
                    stage.addActor(searchMenuBookTable);
                    deleteTable.clear();
                    deleteTable.setPosition(700, 180);
                    deleteTable.add(redactButton).pad(2).row();
                    deleteTable.add(deleteButton);
                    allBookListUpdate();
                }
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
                } else if (!yearsForSerch.contains(" Сотрудник", false)) {
                    yearsForSerch.add(" Сотрудник");
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
                            ((reader.yearsLern == yearsSearch.getSelectedIndex()) || (yearsSearch.getSelectedIndex() == 0))

            ) {

                if (!charForSerch.contains(reader.charClass, false)) {
                    if (reader.yearsLern < 12) {


                        charForSerch.add(reader.charClass);
                    }
                }
            }
        }
        yearsCharSearch.setItems(charForSerch);
    }

     static void getAuthorForSearch() {
         if (!BookArrayOnThreed){
        authorForSerch.clear();
        authorForSerch.add(" Все авторы");
        for (Book book : bookArrayList) {

            authorThisTable = true;
            if (bookMenuTipNow == 2 && book.reader != null) {
                authorThisTable = false;
            } else if (bookMenuTipNow == 1 && book.reader == null) {
                authorThisTable = false;
            }


            if (authorThisTable) {
                if ((nameBookSearch.equals("")) || (nameBookSearch.equals(null))) {
                    if (genreSearch.getSelectedIndex() == 0) {
                        if (!authorForSerch.contains(book.author, false)) {
                            authorForSerch.add(book.author);
                        }
                    } else {

                        if ((!authorForSerch.contains(book.author, false)) && (genreSearch.getSelected().toString().contains(book.genre))) {
                            authorForSerch.add(book.author);
                        }
                    }
                } else if (book.name.contains(nameBookSearch.getText())) {

                    if (genreSearch.getSelectedIndex() == 0) {
                        if (!authorForSerch.contains(book.author, false)) {
                            authorForSerch.add(book.author);
                        }
                    } else {

                        if ((!authorForSerch.contains(book.author, false)) && (genreSearch.getSelected().toString().contains(book.genre))) {
                            authorForSerch.add(book.author);
                        }
                    }
                }
            }

        }
    }}

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

        deleteTable.setPosition(700, 180);


        deleteButton = new TextButton("Удалить", skinTree);
        errorDelLabel = new Label("все книги выданы", skinTree, "red");

        errorDelTable.setPosition(850, 130);
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
                                    logNewString((new GregorianCalendar()).getTime() + " читатель удален из системы " + readersArrayList.get(index).surname + " " + readersArrayList.get(index).name + "///" + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass);
                                } else {
                                    logNewString((new GregorianCalendar()).getTime() + " читатель удален из системы " + readersArrayList.get(index).surname + " " + readersArrayList.get(index).name + "///сотрудник");

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
                            allBook.setColor(Color.RED);
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

                                    if (bookNumber == 1) {
                                        try {
                                            Gdx.files.external("/.prefs/Library/cover/" + bookArrayList.get(i).name + bookArrayList.get(i).author + ".png").delete();
                                        } catch (NullPointerException e) {
                                        }
                                    }


                                    try {

                                      logNewString(
                                                (new GregorianCalendar()).getTime()
                                                        + " книга удалена "
                                                        + bookArrayList.get(i).author +
                                                        "///" + bookArrayList.get(i).name);
                                        bookArrayList.remove(i);

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
                                    //   allALLBookScrollPaneTable = tableListAllBook;
                                    genreSearch.setItems(" Неопределенный жанр", " Учебники[" + genre1 + "]", " Классика[" + genre2 + "]", " Детская литература[" + genre3 + "]", " Справочная литература[" + genre4 + "]", " Зарубежная литература[" + genre5 + "]");
                                    numberAllBook.setText(" " + bookArrayList.size());
                                    bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));
                                    meinMenuUsed();
                                    allBook.setColor(Color.RED);
                                    break;
                                }

                            } else {

                                errorDelTable.setPosition(850, 130);
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
                    stage.addActor(mainMenuTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(redactBook);
                    meinMenuUsed();

                    infoMenuTip = 0;

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


        readerThisBookPreName = new TextField(" Читают эту книгу:", skinTree);
        readerThisBookTable.setPosition(Gdx.graphics.getWidth() + 8, Gdx.graphics.getHeight() / 7 * 6);
        readerThisBook = new SelectBox(skinTree);
        readerThisBookPreName.setDisabled(true);

        readerThisBookTable.add(readerThisBookPreName).pad(2).fill(1.4f, 1).row();
        readerThisBookTable.add(readerThisBook).pad(2).size(150, 50);

        infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3);


        bookOnReaderTable.setFillParent(true);
        infoMenu2Table.setFillParent(true);
        bookOnReaderTable.setPosition(Gdx.graphics.getWidth() / 4, 50);
        infoMenu2Table.setPosition(Gdx.graphics.getWidth() / 3, -Gdx.graphics.getHeight() / 6);

        bookThisReader = new SelectBox(skinTree);
        bookThisReaderPreName = new TextField(" Взятые книги", skinTree);


        bookThisReaderPreName.setDisabled(true);

        classReaderWindow = new TextField(" Класс: Класс", skinTree);
        classReaderWindow.setDisabled(true);
        nameReaderWindow = new TextField(" Имя: Имя", skinTree);
        surnameReaderWindow = new TextField(" Фамилия: Фамилия", skinTree);
        patronymicReaderWindow = new TextField(" Отчество: Отчество", skinTree);
        nameReaderWindow.setDisabled(true);
        surnameReaderWindow.setDisabled(true);
        patronymicReaderWindow.setDisabled(true);
        infoMenu2Table.add(surnameReaderWindow).fill(3.2f, 1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(nameReaderWindow).fill(3.2f, 1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(patronymicReaderWindow).fill(3.2f, 1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(classReaderWindow).fill(3.2f, 1).pad(2, 8, 2, 0).row();


        authorWindow = new TextField(" Автор: Автор", skinTree);
        authorWindow.setDisabled(true);
        numberWindow = new TextField(" Количество: 0", skinTree);
        numberWindow.setDisabled(true);
        imageWindow = new Texture(Gdx.files.internal("noimg.png"));
        genreWindow = new TextField(" Жанр: Жанр", skinTree);
        genreWindow.setDisabled(true);
        descriptionWindow = new Label(" Описание: Описание", skinTree);
        nameBookWindow = new TextField(" Название: Название", skinTree);
        nameBookWindow.setDisabled(true);
        numberBookOfHendWindow = new TextField(" В наличии: 0", skinTree);
        numberBookOfHendWindow.setDisabled(true);
        infoMenuTable.add(nameBookWindow).fill(2.5f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(authorWindow).fill(2.5f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(genreWindow).fill(2.5f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(numberWindow).fill(2.5f, 1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(numberBookOfHendWindow).fill(2.5f, 1).pad(2, 0, 2, 0).row();
        descriptionWindowTable2 = new Table();
        descriptionWindowTable2.add(descriptionWindow);

        descriptionScrollPane = new ScrollPane(descriptionWindowTable2);
        descriptionScrollPane.setScrollingDisabled(true, false);
        descriptionInfoTable.add(descriptionScrollPane).size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() / 5);

        descriptionInfoTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3 - 3 * numberBookOfHendWindow.getHeight() - Gdx.graphics.getHeight() / 10);
        stage.addActor(deleteTable);
        stage.addActor(descriptionInfoTable);
        stage.addActor(infoMenuTable);
        stage.addActor(readerThisBookTable);
    }

    private void allReaderMenu() {

        allReaderList = new List(skinTree);
        allReaderScrollPaneTable.row();
        allReaderScrollPane = new ScrollPane(allReaderScrollPaneTable);

        allReaderScrollPane.setScrollingDisabled(false, false);

        noNullPointerException = true;

        tableListAllReader.add(allReaderScrollPane)
                .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 2 * newBook.getHeight() - 70);
        tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 - 30);


    }

    private void allBookMenu() {

        // allBookList = new List(skin);
        allBookScrollPaneTable.row();
        allBookScrollPane = new ScrollPane(allBookScrollPaneTable);
        allBookScrollPane.setScrollingDisabled(true, false);
        noNullPointerException = true;
        try {
            tableListAllBook.add(allBookScrollPane)
                    .size(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - 2 * bookAdded.getHeight() - newBook.getHeight());


            tableListAllBook.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 - 30);
        } catch (NullPointerException e) {

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


                        if ((!(" Название: " + bookArrayList.get(index).name).equals(nameBookWindow.getText())) ||
                                (!(" Жанр: " + bookArrayList.get(index).genre).equals(genreWindow.getText())) ||
                                (!(" Автор: " + bookArrayList.get(index).author).equals(authorWindow.getText())) ||
                                ((!(bookArrayList.get(index).description).equals(descriptionWindow.getText().toString())) && (!(bookArrayList.get(index).description.equals("")))) ||
                                (!((numberWindow.getText())).equals(" Количество: " + (bookNumber)))) {

                            authorWindow.setText(" Автор: " + bookArrayList.get(index).author);


                            numberWindow.setText(" Количество: " + (bookNumber));
                            numberBookOfHendWindow.setText(" В наличии: " + (bookNumberOfHend));

                            if (Gdx.files.absolute(Gdx.files.external(bookArrayList.get(index).coverBook).file().getAbsolutePath() + ".png").exists()) {
                                imageWindow = new Texture(Gdx.files.absolute(Gdx.files.external(bookArrayList.get(index).coverBook).file().getAbsolutePath() + ".png"));
                            } else {
                                imageWindow = new Texture(Gdx.files.internal("noimg.png"));
                                bookArrayList.get(index).coverBook = "noimg.png";
                            }
                            genreWindow.setText(" Жанр: " + bookArrayList.get(index).genre);

                            if (bookArrayList.get(index).description.equals("")) {
                                descriptionWindow.setText(" Описание");
                            } else {
                                descriptionWindow.setText(bookArrayList.get(index).description);
                            }
                            nameBookWindow.setText(" Название: " + bookArrayList.get(index).name);


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


                                patronymicReaderWindow.setText(" Отчество: " + readersArrayList.get(index).patronymic);
                                surnameReaderWindow.setText(" Фамилия: " + readersArrayList.get(index).surname);
                                nameReaderWindow.setText(" Имя: " + readersArrayList.get(index).name);
                                if (readersArrayList.get(index).yearsLern >= 12) {
                                    classReaderWindow.setText(" сотрудник");
                                } else {
                                    classReaderWindow.setText((" Класс: " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass));
                                }

                            }
                        } else {
                            if (!(" Имя: " + readersArrayList.get(index).name).equals(nameReaderWindow.getText()) ||
                                    !(" Фамилия: " + readersArrayList.get(index).surname).equals(surnameReaderWindow.getText()) ||
                                    !((((readersArrayList.get(index).yearsLern >= 12) && ((" сотрудник").equals(classReaderWindow.getText())))) ||
                                            (" Класс: " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass)
                                                    .equals(classReaderWindow.getText())) ||
                                    !(" Отчество: " + readersArrayList.get(index).patronymic).equals(patronymicReaderWindow.getText())) {

                                patronymicReaderWindow.setText(" Отчество: " + readersArrayList.get(index).patronymic);

                                surnameReaderWindow.setText(" Фамилия: " + readersArrayList.get(index).surname);
                                nameReaderWindow.setText(" Имя: " + readersArrayList.get(index).name);
                                if (readersArrayList.get(index).yearsLern >= 12) {
                                    classReaderWindow.setText(" сотрудник");
                                } else {
                                    classReaderWindow.setText((" Класс: " + readersArrayList.get(index).yearsLern + " " + readersArrayList.get(index).charClass));
                                }
                            }
                        }
                    }

                }
            }


        }
    }

    public static void meinMenuUsed() {

        chooseObject = false;
        readerThisBook.setItems();
        bookThisReader.setItems();
        (nameBookWindow).setText(" Название: Название");
        (authorWindow).setText(" Автор: Автор");
        (genreWindow).setText(" Жанр: Жанр");
        (numberWindow).setText(" Количество: 0");
        (numberBookOfHendWindow).setText(" В наличии: 0");
        classReaderWindow.setText(" Класс: Класс");
        nameReaderWindow.setText(" Имя: Имя");
        surnameReaderWindow.setText(" Фамилия: Фамилия");
        patronymicReaderWindow.setText(" Отчество: Отчество");
        saveError.setText("");


        report.setColor(Color.WHITE);
        newBook.setColor(Color.WHITE);
        newReader.setColor(Color.WHITE);
        giveBook.setColor(Color.WHITE);
        returnBook.setColor(Color.WHITE);

        dolg.setColor(Color.WHITE);
        allBook.setColor(Color.WHITE);
        myBook.setColor(Color.WHITE);
        readers.setColor(Color.WHITE);
        onHands.setColor(Color.WHITE);
        getAuthorForSearch();
    }

    public void meinMenu() {
        reportСompleted = new Label("", skinTree);
        saveButton = new TextButton(" Сохранить", skinTree);
        report = new TextButton(" Отчеты", skinTree);
        mainMenuTable.setFillParent(true);
        exit = new TextButton(" Выход", skinTree);
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


        newReader = new TextButton(" Добавить читателя ", skinTree);
        giveBook = new TextButton(" Выдать книгу ", skinTree);
        returnBook = new TextButton(" Вернуть книгу ", skinTree);

        dolg = new TextButton(" Должники ", skinTree);
        allBook = new TextButton(" Все книги ", skinTree);
        myBook = new TextButton(" Книги в наличии ", skinTree);
        readers = new TextButton(" Все читатели ", skinTree);
        onHands = new TextButton(" Книги на руках ", skinTree);
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
        mainMenuTable.add(saveButton).fillX().pad(2, 2, 0, 0).row();
        mainMenuTable.add();
        mainMenuTable.add();
        mainMenuTable.add();
        mainMenuTable.add();
        mainMenuTable.add();
        stage.addActor(numberAllBookTable);

        allBook.setColor(Color.RED);
        reportTable.setFillParent(true);
        reportTable.setPosition(0, 200);
        reportString = new TextField("", skinTree);
        reportString.setMessageText(" Путь до отчета(по умолчанию загрузки)");
        reportAll = new TextButton(" Полный отчет ", skinTree);
        reportGivReturn = new TextButton(" Отчет о выдаче книг читателям ", skinTree);
        reportNull = new TextButton(" Обнулить отчеты ", skinTree);
        reportOnName = new TextButton(" Отчет на человека ", skinTree);
        reportBook = new TextButton(" Отчет по книге ", skinTree);
        reportTable.add();
        reportTable.add(reportString).fill(2, 1).pad(2, 20, 8, 0);
        reportTable.add().row();
        reportTable.add(reportAll).fillX().pad(2, 0, 0, 2);
        reportTable.add(reportGivReturn).fillX().pad(2, 2, 0, 2);
        reportTable.add(reportOnName).fillX().pad(2, 2, 0, 2);
        reportTable.add(reportBook).fillX().pad(2, 2, 0, 2);
        reportTable.add(reportNull).fillX().pad(2, 2, 0, 2).row();
        StringErrorReportTable.setPosition(1000, 30);
        StringErrorReportTable.add(reportСompleted);
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
                stage.addActor(mainMenuTable);
                stage.addActor(numberAllBookTable);
                stage.addActor(reportTable);
                infoMenuTip = -2;
                meinMenuUsed();
                report.setColor(Color.RED);
                reportOnNameOn = false;
                readersOnReportMenuTable.clear();
                stage.addActor(readersOnReportMenuTable);
                stage.addActor(reportBookTable);
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
                delrep = true;
                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/report.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    delrep = false;
                }
                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    delrep = false;
                }
                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportOnName.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    delrep = false;
                }
                try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportOnBook.txt")).file(), false)) {
                    writer.write("");
                    writer.flush();
                } catch (IOException ex) {
                    delrep = false;
                }
                stage.clear();
                infoMenuTip = -2;
                meinMenuUsed();
                stage.addActor(mainMenuTable);
                stage.addActor(numberAllBookTable);
                stage.addActor(reportTable);
                report.setColor(Color.RED);
                reportOnNameOn = false;
                readersOnReportMenuTable.clear();
                stage.addActor(readersOnReportMenuTable);
                stage.addActor(reportBookTable);
                readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                reportCharName.setSelected(0);
                reportNameName.setSelected(0);
                reportYearsName.setSelected(0);
                reportString.setMessageText(" путь до отчета(по умолчанию загрузки)");
                reportString.setColor(Color.WHITE);
                if (delrep) {
                    reportСompleted.setText("все отчеты удалены");
                }
            }
        });
        reportBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {


                delrep = true;
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Employees sheet");
                reportArray.clear();
                if (reportBookTable.getChildren().size==3){
                    reportName =reportAuthorBook.getSelected().toString()+"///"+reportNameBook.getSelected().toString();

                    if (Objects.equals(reportString.getText(), "")) {



                        rownum = 0;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Ученик");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Класс");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Операция");

                        cell = row.createCell(3, CellType.NUMERIC);
                        cell.setCellValue("Дата");

                        cell = row.createCell(4, CellType.NUMERIC);
                        cell.setCellValue("Книга");

                        cell = row.createCell(5, CellType.NUMERIC);
                        cell.setCellValue("Автор");


                        try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                    // читаем посимвольно
                    int c;
                    String str = "";
                    while ((c = reader.read()) != -1) {

                        str += (char) c;
                    }

                            scet=0;
                            reportArray.clear();
                    for (String s : str.split("\n")) {
if (s.contains(reportName)){
    rownum++;
    row = sheet.createRow(rownum);


                        if (s.contains("книга удалена")) {

                            cell = row.createCell(2, CellType.STRING);
                            cell.setCellValue("Удаление книги");

                            cell = row.createCell(4, CellType.NUMERIC);
                            cell.setCellValue((s.split("книга удалена")[1]).split("///")[0]);

                            cell = row.createCell(5, CellType.NUMERIC);
                            cell.setCellValue((s.split("книга удалена")[1]).split("///")[1]);
                        } else if (s.contains("новая книга")) {

                            cell = row.createCell(2, CellType.STRING);
                            cell.setCellValue("добаавлена книга");

                            cell = row.createCell(4, CellType.NUMERIC);
                            cell.setCellValue((s.split("новая книга")[1]).split("///")[0]);

                            cell = row.createCell(5, CellType.NUMERIC);
                            cell.setCellValue((s.split("новая книга")[1]).split("///")[1]);

                            cell = row.createCell(6, CellType.NUMERIC);
                            cell.setCellValue((s.split("в количестве")[1]));

                        } else if (s.contains("новая персона")) {

                            cell = row.createCell(2, CellType.STRING);
                            cell.setCellValue(" новый читатель");

                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue((s.split("новая персона")[1]).split("///")[0]);
                            if ((s.split("новая персона")[1]).split("///")[1].contains("сотрудник")) {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue("сотрудник");

                            } else {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue((s.split("новая персона")[1]).split("///")[1]);
                            }
                        }else if (s.contains("читатель удален из системы")) {

                            cell = row.createCell(2, CellType.STRING);
                            cell.setCellValue("читатель удален");

                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[0]);

                            if ((s.split("читатель удален из системы")[1]).split("///")[1].contains("сотрудник")) {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue("сотрудник");

                            } else {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[1]);
                            }
                        }else if (s.contains("выдана")) {
                            scet++;
                            reportArray.add(((s.split("выдана")[1]).split("///")[0]));
                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                            if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue("сотрудник");

                            } else {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                            }

                            cell = row.createCell(2, CellType.NUMERIC);
                            cell.setCellValue("книга выдана");


                            cell = row.createCell(4, CellType.NUMERIC);
                            cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                            cell = row.createCell(5, CellType.NUMERIC);
                            cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                        }else if (s.contains("вернул")) {
                            if (reportArray.contains((s.split("вернул")[1]).split("///")[0])){
                                reportArray.remove((s.split("вернул")[1]).split("///")[0]);
                            }

                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                            if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue("сотрудник");

                            } else {
                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                            }

                            cell = row.createCell(2, CellType.NUMERIC);
                            cell.setCellValue("книга возвращена");


                            cell = row.createCell(4, CellType.NUMERIC);
                            cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                            cell = row.createCell(5, CellType.NUMERIC);
                            cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                        }else if (s.contains("измеенена книга")){

                            cell = row.createCell(2, CellType.NUMERIC);
                            cell.setCellValue("книга изменена");

                            cell = row.createCell(4, CellType.NUMERIC);
                            cell.setCellValue((s.split("измеенена книга")[1]).split("///")[0]);

                            cell = row.createCell(5, CellType.NUMERIC);
                            cell.setCellValue((s.split("измеенена книга")[1]).split("///")[1]);

                            cell = row.createCell(6, CellType.NUMERIC);
                            cell.setCellValue((s.split("измеенена книга")[1]).split("///")[3]);



                        }
                        cell = row.createCell(3, CellType.NUMERIC);
    if (s.contains("202")) {
        cell.setCellValue( s.split("202")[0]);
    }else if (s.contains("203")) {
        cell.setCellValue( s.split("203")[0]);
    }else if (s.contains("204")) {
        cell.setCellValue( s.split("204")[0]);
    }else if (s.contains("205")) {
        cell.setCellValue( s.split("205")[0]);
    }else if (s.contains("206")) {
        cell.setCellValue( s.split("206")[0]);
    }else if (s.contains("207")) {
        cell.setCellValue( s.split("207")[0]);
    }else if (s.contains("208")) {
        cell.setCellValue( s.split("208")[0]);
    }else if (s.contains("209")) {
        cell.setCellValue( s.split("209")[0]);
    }else if (s.contains("210")) {
        cell.setCellValue( s.split("210")[0]);
    }
                    }}

                            rownum++;
                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("выдана за все время");

                            cell = row.createCell(1, CellType.STRING);
                            cell.setCellValue(scet);

                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("еще не вернули:");

                            for (int i = 0; i < reportArray.size(); i++) {
                                cell = row.createCell(1, CellType.STRING);
                                cell.setCellValue(reportArray.get(i));
                                rownum++;
                                row = sheet.createRow(rownum);
                            }


                    File file = new File(Gdx.files.external("/Downloads/"+reportName.split("///")[0]+" "+reportName.split("///")[1]+" " +(new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+".xlsx").file().getAbsolutePath());
                    file.getParentFile().mkdirs();

                    FileOutputStream outFile = new FileOutputStream(file);
                    workbook.write(outFile);


                } catch (IOException ex) {
                    System.out.println(ex);
                    delrep = false;
                }



            } else{
                if (Gdx.files.absolute(reportString.getText()).exists()) {


                        rownum =0;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Ученик");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Класс");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Операция");

                        cell = row.createCell(3, CellType.NUMERIC);
                        cell.setCellValue("Дата");

                        cell = row.createCell(4, CellType.NUMERIC);
                        cell.setCellValue("Книга");

                        cell = row.createCell(5, CellType.NUMERIC);
                        cell.setCellValue("Автор");

                        try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                            // читаем посимвольно
                            int c;
                            String str = "";
                            while ((c = reader.read()) != -1) {

                                str += (char) c;
                            }
                            scet=0;
                            reportArray.clear();

                            for (String s : str.split("\n")) {
                                if (s.contains(reportName)) {
                                    rownum++;
                                    row = sheet.createRow(rownum);

                                    if (s.contains("книга удалена")) {

                                        cell = row.createCell(2, CellType.STRING);
                                        cell.setCellValue("Удаление книги");

                                        cell = row.createCell(4, CellType.NUMERIC);
                                        cell.setCellValue((s.split("книга удалена")[1]).split("///")[0]);

                                        cell = row.createCell(5, CellType.NUMERIC);
                                        cell.setCellValue((s.split("книга удалена")[1]).split("///")[1]);
                                    } else if (s.contains("новая книга")) {

                                        cell = row.createCell(2, CellType.STRING);
                                        cell.setCellValue("добаавлена книга");

                                        cell = row.createCell(4, CellType.NUMERIC);
                                        cell.setCellValue((s.split("новая книга")[1]).split("///")[0]);

                                        cell = row.createCell(5, CellType.NUMERIC);
                                        cell.setCellValue((s.split("новая книга")[1]).split("///")[1]);

                                        cell = row.createCell(6, CellType.NUMERIC);
                                        cell.setCellValue((s.split("в количестве")[1]));

                                    } else if (s.contains("новая персона")) {

                                        cell = row.createCell(2, CellType.STRING);
                                        cell.setCellValue(" новый читатель");

                                        cell = row.createCell(0, CellType.NUMERIC);
                                        cell.setCellValue((s.split("новая персона")[1]).split("///")[0]);
                                        if ((s.split("новая персона")[1]).split("///")[1].contains("сотрудник")) {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue("сотрудник");

                                        } else {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue((s.split("новая персона")[1]).split("///")[1]);
                                        }
                                    } else if (s.contains("читатель удален из системы")) {

                                        cell = row.createCell(2, CellType.STRING);
                                        cell.setCellValue("читатель удален");

                                        cell = row.createCell(0, CellType.NUMERIC);
                                        cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[0]);

                                        if ((s.split("читатель удален из системы")[1]).split("///")[1].contains("сотрудник")) {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue("сотрудник");

                                        } else {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[1]);
                                        }
                                    } else if (s.contains("выдана")) {
                                        scet++;
                                        reportArray.add(((s.split("выдана")[1]).split("///")[0]));

                                        cell = row.createCell(0, CellType.NUMERIC);
                                        cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                                        if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue("сотрудник");

                                        } else {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                                        }

                                        cell = row.createCell(2, CellType.NUMERIC);
                                        cell.setCellValue("книга выдана");


                                        cell = row.createCell(4, CellType.NUMERIC);
                                        cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                                        cell = row.createCell(5, CellType.NUMERIC);
                                        cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                                    } else if (s.contains("вернул")) {
                                        if (reportArray.contains((s.split("вернул")[1]).split("///")[0])){
                                            reportArray.remove((s.split("вернул")[1]).split("///")[0]);
                                        }
                                        cell = row.createCell(0, CellType.NUMERIC);
                                        cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                                        if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue("сотрудник");

                                        } else {
                                            cell = row.createCell(1, CellType.NUMERIC);
                                            cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                                        }

                                        cell = row.createCell(2, CellType.NUMERIC);
                                        cell.setCellValue("книга возвращена");


                                        cell = row.createCell(4, CellType.NUMERIC);
                                        cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                                        cell = row.createCell(5, CellType.NUMERIC);
                                        cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                                    } else if (s.contains("измеенена книга")){

                                        cell = row.createCell(2, CellType.NUMERIC);
                                        cell.setCellValue("книга изменена");

                                        cell = row.createCell(4, CellType.NUMERIC);
                                        cell.setCellValue((s.split("измеенена книга")[1]).split("///")[0]);

                                        cell = row.createCell(5, CellType.NUMERIC);
                                        cell.setCellValue((s.split("измеенена книга")[1]).split("///")[1]);

                                        cell = row.createCell(6, CellType.NUMERIC);
                                        cell.setCellValue((s.split("измеенена книга")[1]).split("///")[3]);



                                    }
                                    cell = row.createCell(3, CellType.NUMERIC);
                                    if (s.contains("202")) {
                                        cell.setCellValue( s.split("202")[0]);
                                    }else if (s.contains("203")) {
                                        cell.setCellValue( s.split("203")[0]);
                                    }else if (s.contains("204")) {
                                        cell.setCellValue( s.split("204")[0]);
                                    }else if (s.contains("205")) {
                                        cell.setCellValue( s.split("205")[0]);
                                    }else if (s.contains("206")) {
                                        cell.setCellValue( s.split("206")[0]);
                                    }else if (s.contains("207")) {
                                        cell.setCellValue( s.split("207")[0]);
                                    }else if (s.contains("208")) {
                                        cell.setCellValue( s.split("208")[0]);
                                    }else if (s.contains("209")) {
                                        cell.setCellValue( s.split("209")[0]);
                                    }else if (s.contains("210")) {
                                        cell.setCellValue( s.split("210")[0]);
                                    }

                                } }
                           rownum++;
                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("выдана за все время");

                            cell = row.createCell(1, CellType.STRING);
                            cell.setCellValue(scet);

                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("еще не вернули:");

                            for (int i = 0; i < reportArray.size(); i++) {
                                cell = row.createCell(1, CellType.STRING);
                                cell.setCellValue(reportArray.get(i));
                                rownum++;
                                row = sheet.createRow(rownum);
                            }

                            File file = new File(Gdx.files.absolute(reportString.getText() + "/Статистика на книгу "+reportName.split("///")[0]+" "+reportName.split("///")[1]+" " + (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+ ".xlsx").file().getAbsolutePath());
                            file.getParentFile().mkdirs();

                            FileOutputStream outFile = new FileOutputStream(file);
                            workbook.write(outFile);


                        } catch (IOException ex) {
                            System.out.println(ex);
                            delrep = false;
                        }


                    } else {
                    reportString.setText(null);
                    reportString.setMessageText("такого пути не существует");
                }
            }
                    if (delrep) {
                        reportСompleted.setText("отчет успешно сохранен\n" +
                                pathReport);
                    } else {
                        reportСompleted.setText("ошибка сохранения отчета");
                    }
                } else {
                    reportСompleted.setText("укажите, на какую книгу сделать отчет");
                }
            }
        });
        reportBookTable.setFillParent(true);
        reportBookTable.setPosition(300, 50);
        reportAuthorBook = new SelectBox(skinTree);
        reportNameBook = new SelectBox(skinTree);
        reportGenreBook = new SelectBox(skinTree);
        reportGenreBook.setItems(" Неопределенный жанр", " Учебники", " Классика", " Детская литература", " Справочная литература", " Зарубежная литература");
        reportGenreBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                reportBookStr.clear();
                for (Book book : bookArrayList) {
                    if ((book.genre.equals(reportGenreBook.getSelected())) && ((!(reportBookStr.contains(book.author)) && (book.author.length() < 18)))) {
                        reportBookStr.add(book.author);
                    } else if ((book.author.length() >= 18) && (book.genre.equals(reportGenreBook.getSelected()))) {
                        if (!(reportBookStr.contains(
                                String.valueOf(book.author.charAt(0)) + book.author.charAt(1) + book.author.charAt(2) + book.author.charAt(3) + book.author.charAt(4) +
                                        book.author.charAt(5) + book.author.charAt(6) + book.author.charAt(7) + book.author.charAt(8) + book.author.charAt(9)
                                        + book.author.charAt(10) + book.author.charAt(11) + book.author.charAt(12) + book.author.charAt(13)
                                        + book.author.charAt(14) + book.author.charAt(15) + book.author.charAt(16) + book.author.charAt(17)
                        ))) {
                            {
                                reportBookStr.add(String.valueOf(book.author.charAt(0)));
                                for (int i = 1; i < 18; i++) {
                                    reportBookStr.set(reportBookStr.size() - 1, reportBookStr.get(reportBookStr.size() - 1) + book.author.charAt(i));
                                }
                            }
                        }
                    }
                }
                reportAuthorBook.setItems(reportBookStr.toArray());
                reportBookTable.clear();
                reportBookTable.add(reportGenreBook).pad(2).row();
                reportBookTable.add(reportAuthorBook).pad(2).row();
            }
        });


        reportAuthorBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                reportBookStr2.clear();
                for (Book book : bookArrayList) {
                    if ((book.genre.equals(reportGenreBook.getSelected()))) {
                        if ((book.author.equals(reportAuthorBook.getSelected())) && (reportAuthorBook.getSelected().toString().length() < 18)) {
                            if (book.name.length() < 18) {
                                if (!(reportBookStr2.contains(book.name))) {
                                    reportBookStr2.add(book.name);
                                }
                            } else if (!(reportBookStr2.contains(String.valueOf(book.name.charAt(0)) + book.name.charAt(1) + book.name.charAt(2) + book.name.charAt(3) + book.name.charAt(4) +
                                    book.name.charAt(5) + book.name.charAt(6) + book.name.charAt(7) + book.name.charAt(8) + book.name.charAt(9)
                                    + book.name.charAt(10) + book.name.charAt(11) + book.name.charAt(12) + book.name.charAt(13)
                                    + book.name.charAt(14) + book.name.charAt(15) + book.name.charAt(16) + book.name.charAt(17)))
                            ) {


                                reportBookStr2.add(String.valueOf(book.name.charAt(0)));
                                for (int i = 1; i < 18; i++) {
                                    reportBookStr2.set(reportBookStr2.size() - 1, reportBookStr2.get(reportBookStr2.size() - 1) + book.name.charAt(i));
                                }
                            }


                        } else if (book.author.length() >= 18) {
                            if ((reportAuthorBook.getSelected().equals(String.valueOf(book.author.charAt(0)) + book.author.charAt(1) + book.author.charAt(2) + book.author.charAt(3) + book.author.charAt(4) +
                                    book.author.charAt(5) + book.author.charAt(6) + book.author.charAt(7) + book.author.charAt(8) + book.author.charAt(9)
                                    + book.author.charAt(10) + book.author.charAt(11) + book.author.charAt(12) + book.author.charAt(13)
                                    + book.author.charAt(14) + book.author.charAt(15) + book.author.charAt(16) + book.author.charAt(17)))
                                    && (reportAuthorBook.getSelected().toString().length() >= 18)) {
                                if (!(reportBookStr2.contains(String.valueOf(book.name.charAt(0)) + book.name.charAt(1) + book.name.charAt(2) + book.name.charAt(3) + book.name.charAt(4) +
                                        book.name.charAt(5) + book.name.charAt(6) + book.name.charAt(7) + book.name.charAt(8) + book.name.charAt(9)
                                        + book.name.charAt(10) + book.name.charAt(11) + book.name.charAt(12) + book.name.charAt(13)
                                        + book.name.charAt(14) + book.name.charAt(15) + book.name.charAt(16) + book.name.charAt(17)))
                                ) {


                                    reportBookStr2.add(String.valueOf(book.name.charAt(0)));
                                    for (int i = 1; i < 18; i++) {
                                        reportBookStr2.set(reportBookStr2.size() - 1, reportBookStr2.get(reportBookStr2.size() - 1) + book.name.charAt(i));
                                    }
                                } else if (book.name.length() < 18) {
                                    if (!(reportBookStr2.contains(book.name))) {
                                        reportBookStr2.add(book.name);
                                    }
                                }


                            }
                        }
                    }
                }
                reportNameBook.setItems(reportBookStr2.toArray());
                reportBookTable.clear();
                reportBookTable.add(reportGenreBook).pad(2).row();
                reportBookTable.add(reportAuthorBook).pad(2).row();
                reportBookTable.add(reportNameBook).pad(2).row();

            }
        });
        reportBookTable.add(reportGenreBook).pad(2).row();
        reportYearsName = new SelectBox(skinTree);
        reportCharName = new SelectBox(skinTree);
        reportNameName = new SelectBox(skinTree);
        reportYearsName.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудник");
        readersOnReportMenuTable.setFillParent(true);
        readersOnReportMenuTable.setPosition(70, 50);
        readersOnReportMenuTable.add(reportYearsName).pad(2).row();
        reportYearsName.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if (reportYearsName.getSelectedIndex() == 11) {
                    getReadersSurnameByClass(reportYearsName.getSelectedIndex() + 1, "");
                    reportNameName.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
                    readersOnReportMenuTable.clear();
                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add(reportNameName).pad(2).row();
                } else {
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
                if (reportYearsName.getSelectedIndex() == 11) {
                    readersOnReportMenuTable.clear();
                    readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                    readersOnReportMenuTable.add().row();
                    readersOnReportMenuTable.add(reportNameName).pad(2).row();
                    reportOnNameOn = true;
                } else {
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
                delrep = true;
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Employees sheet");
                if (Objects.equals(reportString.getText(), "")) {

                    rownum = 0;
                    row = sheet.createRow(rownum);

                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellValue("Ученик");

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue("Класс");

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue("Операция");

                    cell = row.createCell(3, CellType.NUMERIC);
                    cell.setCellValue("Дата");

                    cell = row.createCell(4, CellType.NUMERIC);
                    cell.setCellValue("Книга");

                    cell = row.createCell(5, CellType.NUMERIC);
                    cell.setCellValue("Автор");

                    try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                        // читаем посимвольно
                        int c;
                        String str = "";
                        while ((c = reader.read()) != -1) {

                            str += (char) c;
                        }

                        scet=0;
                        reportArray.clear();
                        for (String s : str.split("\n")) {
                            rownum++;
                            row = sheet.createRow(rownum);

                            if (s.contains("книга удалена")) {

                                cell = row.createCell(2, CellType.STRING);
                                cell.setCellValue("Удаление книги");

                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("книга удалена")[1]).split("///")[0]);

                                cell = row.createCell(5, CellType.NUMERIC);

                                cell.setCellValue((s.split("книга удалена")[1]).split("///")[1]);
                            } else if (s.contains("новая книга")) {

                                cell = row.createCell(2, CellType.STRING);
                                cell.setCellValue("добаавлена книга");

                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("новая книга")[1]).split("///")[0]);

                                cell = row.createCell(5, CellType.NUMERIC);
                                cell.setCellValue((s.split("новая книга")[1]).split("///")[1]);

                                cell = row.createCell(6, CellType.NUMERIC);
                                cell.setCellValue((s.split("в количестве")[1]));

                            } else if (s.contains("новая персона")) {

                                cell = row.createCell(2, CellType.STRING);
                                cell.setCellValue(" новый читатель");

                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split("новая персона")[1]).split("///")[0]);
                                if ((s.split("новая персона")[1]).split("///")[1].contains("сотрудник")) {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("сотрудник");

                                } else {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая персона")[1]).split("///")[1]);
                                }
                            }else if (s.contains("читатель удален из системы")) {

                                cell = row.createCell(2, CellType.STRING);
                                cell.setCellValue("читатель удален");

                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[0]);

                                if ((s.split("читатель удален из системы")[1]).split("///")[1].contains("сотрудник")) {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("сотрудник");

                                } else {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[1]);
                                }
                            }else if (s.contains("выдана")) {
                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                                if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("сотрудник");

                                } else {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                                }

                                cell = row.createCell(2, CellType.NUMERIC);
                                cell.setCellValue("книга выдана");


                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                                cell = row.createCell(5, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                            }else if (s.contains("вернул")) {
                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                                if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("сотрудник");

                                } else {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                                }

                                cell = row.createCell(2, CellType.NUMERIC);
                                cell.setCellValue("книга возвращена");


                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                                cell = row.createCell(5, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                            }else if (s.contains("измеенена книга")){

                                cell = row.createCell(2, CellType.NUMERIC);
                                cell.setCellValue("книга изменена");

                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("измеенена книга")[1]).split("///")[0]);

                                cell = row.createCell(5, CellType.NUMERIC);
                                cell.setCellValue((s.split("измеенена книга")[1]).split("///")[1]);

                                cell = row.createCell(6, CellType.NUMERIC);
                                cell.setCellValue((s.split("измеенена книга")[1]).split("///")[3]);



                            }else if (s.contains(" читатель выпустился из 11 класса ")){

                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split(" читатель выпустился из 11 класса ")[1]));


                                cell = row.createCell(1, CellType.NUMERIC);
                                cell.setCellValue("выпустился");

                                cell = row.createCell(2, CellType.NUMERIC);
                                cell.setCellValue(" читатель выпустился из 11 класса ");

                            }
                            cell = row.createCell(3, CellType.NUMERIC);
                            if (s.contains("202")) {
                                cell.setCellValue( s.split("202")[0]);
                            }else if (s.contains("203")) {
                                cell.setCellValue( s.split("203")[0]);
                            }else if (s.contains("204")) {
                                cell.setCellValue( s.split("204")[0]);
                            }else if (s.contains("205")) {
                                cell.setCellValue( s.split("205")[0]);
                            }else if (s.contains("206")) {
                                cell.setCellValue( s.split("206")[0]);
                            }else if (s.contains("207")) {
                                cell.setCellValue( s.split("207")[0]);
                            }else if (s.contains("208")) {
                                cell.setCellValue( s.split("208")[0]);
                            }else if (s.contains("209")) {
                                cell.setCellValue( s.split("209")[0]);
                            }else if (s.contains("210")) {
                                cell.setCellValue( s.split("210")[0]);
                            }
                        }
                        File file = new File(Gdx.files.external("/Downloads/Статистика библиотеки до "+ (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+".xlsx").file().getAbsolutePath());
                        file.getParentFile().mkdirs();

                        FileOutputStream outFile = new FileOutputStream(file);
                        workbook.write(outFile);


                    } catch (IOException ex) {
                        System.out.println(ex);
                        delrep = false;
                    }



                } else {
                    if (Gdx.files.absolute(reportString.getText()).exists()) {


                        rownum =0;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Ученик");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Класс");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Операция");

                        cell = row.createCell(3, CellType.NUMERIC);
                        cell.setCellValue("Дата");

                        cell = row.createCell(4, CellType.NUMERIC);
                        cell.setCellValue("Книга");

                        cell = row.createCell(5, CellType.NUMERIC);
                        cell.setCellValue("Автор");

                        try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                            // читаем посимвольно
                            int c;
                            String str = "";
                            while ((c = reader.read()) != -1) {

                                str += (char) c;
                            }

                            scet=0;
                            reportArray.clear();
                            for (String s : str.split("\n")) {
                                rownum++;
                                row = sheet.createRow(rownum);

                                if (s.contains("книга удалена")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue("Удаление книги");

                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("книга удалена")[1]).split("///")[0]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("книга удалена")[1]).split("///")[1]);
                                } else if (s.contains("новая книга")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue("добаавлена книга");

                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая книга")[1]).split("///")[0]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая книга")[1]).split("///")[1]);

                                    cell = row.createCell(6, CellType.NUMERIC);
                                    cell.setCellValue((s.split("в количестве")[1]));

                                } else if (s.contains("новая персона")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue(" новый читатель");

                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая персона")[1]).split("///")[0]);
                                    if ((s.split("новая персона")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("новая персона")[1]).split("///")[1]);
                                    }
                                }else if (s.contains("читатель удален из системы")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue("читатель удален");

                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[0]);

                                    if ((s.split("читатель удален из системы")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[1]);
                                    }
                                }else if (s.contains("выдана")) {
                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                                    if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                                    }

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга выдана");


                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                                }else if (s.contains("вернул")) {
                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                                    if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                                    }

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга возвращена");


                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                                }else if (s.contains("измеенена книга")){

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга изменена");

                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("измеенена книга")[1]).split("///")[0]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("измеенена книга")[1]).split("///")[1]);

                                    cell = row.createCell(6, CellType.NUMERIC);
                                    cell.setCellValue((s.split("измеенена книга")[1]).split("///")[3]);



                                }else if (s.contains(" читатель выпустился из 11 класса ")){

                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split(" читатель выпустился из 11 класса ")[1]));


                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("выпустился");

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue(" читатель выпустился из 11 класса ");

                                }
                                cell = row.createCell(3, CellType.NUMERIC);
                                if (s.contains("202")) {
                                    cell.setCellValue( s.split("202")[0]);
                                }else if (s.contains("203")) {
                                    cell.setCellValue( s.split("203")[0]);
                                }else if (s.contains("204")) {
                                    cell.setCellValue( s.split("204")[0]);
                                }else if (s.contains("205")) {
                                    cell.setCellValue( s.split("205")[0]);
                                }else if (s.contains("206")) {
                                    cell.setCellValue( s.split("206")[0]);
                                }else if (s.contains("207")) {
                                    cell.setCellValue( s.split("207")[0]);
                                }else if (s.contains("208")) {
                                    cell.setCellValue( s.split("208")[0]);
                                }else if (s.contains("209")) {
                                    cell.setCellValue( s.split("209")[0]);
                                }else if (s.contains("210")) {
                                    cell.setCellValue( s.split("210")[0]);
                                }
                            }
                            File file = new File(Gdx.files.absolute(reportString.getText()+"/Статистика библиотеки до "+ (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+".xlsx").file().getAbsolutePath());
                            file.getParentFile().mkdirs();

                            FileOutputStream outFile = new FileOutputStream(file);
                            workbook.write(outFile);


                        } catch (IOException ex) {
                            System.out.println(ex);
                            delrep = false;
                        }




                    } else {
                        reportString.setText(null);
                        reportString.setMessageText("такого пути не существует");
                    }
                }

                if (delrep) {
                    reportСompleted.setText("отчет успешно сохранен\n" +
                            pathReport);
                } else {
                    reportСompleted.setText("ошибка сохранения отчета");
                }
            }
        });

        reportGivReturn.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {
                delrep = true;
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Employees sheet");
                if (Objects.equals(reportString.getText(), "")) {
                    rownum = 0;
                    row = sheet.createRow(rownum);

                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellValue("Ученик");

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue("Класс");

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue("Операция");

                    cell = row.createCell(3, CellType.NUMERIC);
                    cell.setCellValue("Дата");

                    cell = row.createCell(4, CellType.NUMERIC);
                    cell.setCellValue("Книга");

                    cell = row.createCell(5, CellType.NUMERIC);
                    cell.setCellValue("Автор");

                    try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).file())) {

                        // читаем посимвольно
                        int c;
                        String str = "";
                        while ((c = reader.read()) != -1) {

                            str += (char) c;
                        }
                        scet=0;
                        reportArray.clear();

                        for (String s : str.split("\n")) {
                            rownum++;
                            row = sheet.createRow(rownum);

                          if (s.contains("выдана")) {
                              scet++;
                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                                if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("сотрудник");

                                } else {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                                }

                                cell = row.createCell(2, CellType.NUMERIC);
                                cell.setCellValue("книга выдана");


                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                                cell = row.createCell(5, CellType.NUMERIC);
                                cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                            }else if (s.contains("вернул")) {
                                cell = row.createCell(0, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                                if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("сотрудник");

                                } else {
                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                                }

                                cell = row.createCell(2, CellType.NUMERIC);
                                cell.setCellValue("книга возвращена");


                                cell = row.createCell(4, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                                cell = row.createCell(5, CellType.NUMERIC);
                                cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                            }
                            cell = row.createCell(3, CellType.NUMERIC);
                            if (s.contains("202")) {
                                cell.setCellValue( s.split("202")[0]);
                            }else if (s.contains("203")) {
                                cell.setCellValue( s.split("203")[0]);
                            }else if (s.contains("204")) {
                                cell.setCellValue( s.split("204")[0]);
                            }else if (s.contains("205")) {
                                cell.setCellValue( s.split("205")[0]);
                            }else if (s.contains("206")) {
                                cell.setCellValue( s.split("206")[0]);
                            }else if (s.contains("207")) {
                                cell.setCellValue( s.split("207")[0]);
                            }else if (s.contains("208")) {
                                cell.setCellValue( s.split("208")[0]);
                            }else if (s.contains("209")) {
                                cell.setCellValue( s.split("209")[0]);
                            }else if (s.contains("210")) {
                                cell.setCellValue( s.split("210")[0]);
                            }
                        }

                        rownum++;
                        rownum++;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.NUMERIC);
                        cell.setCellValue("книг выданно");
                        cell = row.createCell(1, CellType.NUMERIC);
                        cell.setCellValue(scet);




                        File file = new File(Gdx.files.external("/Downloads/Статистика книговыдачи библиотеки до "+ (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+".xlsx").file().getAbsolutePath());
                        file.getParentFile().mkdirs();

                        FileOutputStream outFile = new FileOutputStream(file);
                        workbook.write(outFile);


                    } catch (IOException ex) {
                        System.out.println(ex);
                        delrep = false;
                    }



                } else {
                    if (Gdx.files.absolute(reportString.getText()).exists()) {
                        rownum = 0;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Ученик");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Класс");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Операция");

                        cell = row.createCell(3, CellType.NUMERIC);
                        cell.setCellValue("Дата");

                        cell = row.createCell(4, CellType.NUMERIC);
                        cell.setCellValue("Книга");

                        cell = row.createCell(5, CellType.NUMERIC);
                        cell.setCellValue("Автор");

                        try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).file())) {

                            // читаем посимвольно
                            int c;
                            String str = "";
                            while ((c = reader.read()) != -1) {

                                str += (char) c;
                            } scet=0;
                            reportArray.clear();
                            for (String s : str.split("\n")) {
                                rownum++;
                                row = sheet.createRow(rownum);

                                if (s.contains("выдана")) {
                                    scet++;
                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                                    if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                                    }

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга выдана");


                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                                }else if (s.contains("вернул")) {
                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                                    if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                                    }

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга возвращена");


                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                                }
                                cell = row.createCell(3, CellType.NUMERIC);
                                if (s.contains("202")) {
                                    cell.setCellValue( s.split("202")[0]);
                                }else if (s.contains("203")) {
                                    cell.setCellValue( s.split("203")[0]);
                                }else if (s.contains("204")) {
                                    cell.setCellValue( s.split("204")[0]);
                                }else if (s.contains("205")) {
                                    cell.setCellValue( s.split("205")[0]);
                                }else if (s.contains("206")) {
                                    cell.setCellValue( s.split("206")[0]);
                                }else if (s.contains("207")) {
                                    cell.setCellValue( s.split("207")[0]);
                                }else if (s.contains("208")) {
                                    cell.setCellValue( s.split("208")[0]);
                                }else if (s.contains("209")) {
                                    cell.setCellValue( s.split("209")[0]);
                                }else if (s.contains("210")) {
                                    cell.setCellValue( s.split("210")[0]);
                                }
                            }
                            rownum++;
                            rownum++;
                            row = sheet.createRow(rownum);

                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue("книг выданно");
                            cell = row.createCell(1, CellType.NUMERIC);
                            cell.setCellValue(scet);
                            File file = new File(Gdx.files.absolute(reportString.getText()+"/Статистика книговыдачи библиотеки до "+ (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+".xlsx").file().getAbsolutePath());
                            file.getParentFile().mkdirs();

                            FileOutputStream outFile = new FileOutputStream(file);
                            workbook.write(outFile);


                        } catch (IOException ex) {
                            System.out.println(ex);
                            delrep = false;
                        }





                    } else {
                        reportString.setText(null);
                        reportString.setMessageText(" такого пути не существует");
                    }
                }
                if (delrep) {
                    reportСompleted.setText("отчет успешно сохранен\n" +
                            pathReport);
                } else {
                    reportСompleted.setText("ошибка сохранения отчета");
                }
            }
        });
        reportOnName.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {
                delrep = true;
                if (reportOnNameOn) {
                    if (reportYearsName.getSelectedIndex() + 1 < 12) {
                        reportName = reportNameName.getSelected() + "///" + (reportYearsName.getSelectedIndex() + 1) + " " + reportCharName.getSelected();
                    } else {
                        reportName = reportNameName.getSelected() + "///сотрудник";

                    }

                    workbook = new XSSFWorkbook();
                    sheet = workbook.createSheet("Employees sheet");
       reportArray.clear();

                    if (Objects.equals(reportString.getText(), "")) {



                        rownum = 0;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Ученик");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Класс");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Операция");

                        cell = row.createCell(3, CellType.NUMERIC);
                        cell.setCellValue("Дата");

                        cell = row.createCell(4, CellType.NUMERIC);
                        cell.setCellValue("Книга");

                        cell = row.createCell(5, CellType.NUMERIC);
                        cell.setCellValue("Автор");

                        try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                            // читаем посимвольно
                            int c;
                            String str = "";
                            while ((c = reader.read()) != -1) {

                                str += (char) c;
                            }
                            scet=0;
                            reportArray.clear();


                            for (String s : str.split("\n")) {

if (s.contains(reportName)) {

    rownum++;
    row = sheet.createRow(rownum);

    if (s.contains("новая персона")) {

        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue(" новый читатель");

        cell = row.createCell(0, CellType.NUMERIC);
        cell.setCellValue((s.split("новая персона")[1]).split("///")[0]);
        if ((s.split("новая персона")[1]).split("///")[1].contains("сотрудник")) {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue("сотрудник");

        } else {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue((s.split("новая персона")[1]).split("///")[1]);
        }
    } else if (s.contains("читатель удален из системы")) {

        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("читатель удален");

        cell = row.createCell(0, CellType.NUMERIC);
        cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[0]);

        if ((s.split("читатель удален из системы")[1]).split("///")[1].contains("сотрудник")) {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue("сотрудник");

        } else {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[1]);
        }
    } else if (s.contains("выдана")) {
        scet++;
        reportArray.add((s.split("выдана")[0]).split("книга:")[1].split("///")[1] + (s.split("выдана")[0]).split("книга:")[1].split("///")[0]);
        cell = row.createCell(0, CellType.NUMERIC);
        cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

        if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue("сотрудник");

        } else {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
        }

        cell = row.createCell(2, CellType.NUMERIC);
        cell.setCellValue("книга выдана");


        cell = row.createCell(4, CellType.NUMERIC);
        cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

        cell = row.createCell(5, CellType.NUMERIC);
        cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

    } else if (s.contains("вернул")) {
        if (reportArray.contains((s.split("вернул")[0]).split("книгу:")[1].split("///")[1] +
                (s.split("вернул")[0]).split("книгу:")[1].split("///")[0])) {
            reportArray.remove((s.split("вернул")[0]).split("книгу:")[1].split("///")[1] +
                    (s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
        }
        cell = row.createCell(0, CellType.NUMERIC);
        cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

        if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue("сотрудник");

        } else {
            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
        }

        cell = row.createCell(2, CellType.NUMERIC);
        cell.setCellValue("книга возвращена");


        cell = row.createCell(4, CellType.NUMERIC);
        cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

        cell = row.createCell(5, CellType.NUMERIC);
        cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
    } else if (s.contains(" читатель выпустился из 11 класса ")){

        cell = row.createCell(0, CellType.NUMERIC);
        cell.setCellValue((s.split(" читатель выпустился из 11 класса ")[1]));


            cell = row.createCell(1, CellType.NUMERIC);
            cell.setCellValue("выпустился");

        cell = row.createCell(2, CellType.NUMERIC);
        cell.setCellValue(" читатель выпустился из 11 класса ");

    }
    cell = row.createCell(3, CellType.NUMERIC);
    if (s.contains("202")) {
        cell.setCellValue(s.split("202")[0]);
    } else if (s.contains("203")) {
        cell.setCellValue(s.split("203")[0]);
    } else if (s.contains("204")) {
        cell.setCellValue(s.split("204")[0]);
    } else if (s.contains("205")) {
        cell.setCellValue(s.split("205")[0]);
    } else if (s.contains("206")) {
        cell.setCellValue(s.split("206")[0]);
    } else if (s.contains("207")) {
        cell.setCellValue(s.split("207")[0]);
    } else if (s.contains("208")) {
        cell.setCellValue(s.split("208")[0]);
    } else if (s.contains("209")) {
        cell.setCellValue(s.split("209")[0]);
    } else if (s.contains("210")) {
        cell.setCellValue(s.split("210")[0]);
    }
}}
                            rownum++;
                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("взял за все время");

                            cell = row.createCell(1, CellType.STRING);
                            cell.setCellValue(scet);

                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("еще не вернул:");
                            for (int i = 0; i < reportArray.size(); i++) {
                                cell = row.createCell(1, CellType.STRING);
                                cell.setCellValue(reportArray.get(i));
                                rownum++;
                                row = sheet.createRow(rownum);
                            }


                            File file =(Gdx.files.external("/Downloads/"+reportName.split("///")[0]+" " +reportName.split("///")[1]+" cтатистика до " + (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2] + ".xlsx").file());
                            file.getParentFile().mkdirs();

                            FileOutputStream outFile = new FileOutputStream(file);
                            workbook.write(outFile);


                        } catch (IOException ex) {


                            System.out.println(ex.getMessage());

                            delrep = false;
                        }


                    } else if (Gdx.files.absolute(reportString.getText()).exists()) {


                        rownum = 0;
                        row = sheet.createRow(rownum);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Ученик");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Класс");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Операция");

                        cell = row.createCell(3, CellType.NUMERIC);
                        cell.setCellValue("Дата");

                        cell = row.createCell(4, CellType.NUMERIC);
                        cell.setCellValue("Книга");

                        cell = row.createCell(5, CellType.NUMERIC);
                        cell.setCellValue("Автор");

                        try (FileReader reader = new FileReader((Gdx.files.external("/.prefs/Library/report.txt")).file())) {

                            // читаем посимвольно
                            int c;
                            String str = "";
                            while ((c = reader.read()) != -1) {

                                str += (char) c;
                            }

                            scet=0;
                            reportArray.clear();
                            for (String s : str.split("\n")) {
                                if (s.contains(reportName)){
                                    rownum++;
                                    row = sheet.createRow(rownum);
                                if (s.contains("книга удалена")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue("Удаление книги");

                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("книга удалена")[1]).split("///")[0]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("книга удалена")[1]).split("///")[1]);
                                } else if (s.contains("новая книга")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue("добаавлена книга");

                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая книга")[1]).split("///")[0]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая книга")[1]).split("///")[1]);

                                    cell = row.createCell(6, CellType.NUMERIC);
                                    cell.setCellValue((s.split("в количестве")[1]));

                                } else if (s.contains("новая персона")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue(" новый читатель");

                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("новая персона")[1]).split("///")[0]);
                                    if ((s.split("новая персона")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("новая персона")[1]).split("///")[1]);
                                    }
                                } else if (s.contains("читатель удален из системы")) {

                                    cell = row.createCell(2, CellType.STRING);
                                    cell.setCellValue("читатель удален");

                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[0]);

                                    if ((s.split("читатель удален из системы")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("читатель удален из системы")[1]).split("///")[1]);
                                    }
                                } else if (s.contains("выдана")) {
                                    scet++;
                                    reportArray.add((s.split("выдана")[0]).split("книга:")[1].split("///")[1]+(s.split("выдана")[0]).split("книга:")[1].split("///")[0]);
                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[1]).split("///")[0]);

                                    if ((s.split("выдана")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("выдана")[1]).split("///")[1]);
                                    }

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга выдана");


                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[1]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("выдана")[0]).split("книга:")[1].split("///")[0]);

                                } else if (s.contains("вернул")) {
                                    if ( reportArray.contains((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]+
                                            (s.split("вернул")[0]).split("книгу:")[1].split("///")[0])){
                                        reportArray.remove((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]+
                                                (s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                                    }
                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[1]).split("///")[0]);

                                    if ((s.split("вернул")[1]).split("///")[1].contains("сотрудник")) {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue("сотрудник");

                                    } else {
                                        cell = row.createCell(1, CellType.NUMERIC);
                                        cell.setCellValue((s.split("вернул")[1]).split("///")[1]);
                                    }

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue("книга возвращена");


                                    cell = row.createCell(4, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[1]);

                                    cell = row.createCell(5, CellType.NUMERIC);
                                    cell.setCellValue((s.split("вернул")[0]).split("книгу:")[1].split("///")[0]);
                                } else if (s.contains(" читатель выпустился из 11 класса ")){

                                    cell = row.createCell(0, CellType.NUMERIC);
                                    cell.setCellValue((s.split(" читатель выпустился из 11 класса ")[1]));


                                    cell = row.createCell(1, CellType.NUMERIC);
                                    cell.setCellValue("выпустился");

                                    cell = row.createCell(2, CellType.NUMERIC);
                                    cell.setCellValue(" читатель выпустился из 11 класса ");

                                }
                                cell = row.createCell(3, CellType.NUMERIC);
                                    if (s.contains("202")) {
                                        cell.setCellValue( s.split("202")[0]);
                                    }else if (s.contains("203")) {
                                        cell.setCellValue( s.split("203")[0]);
                                    }else if (s.contains("204")) {
                                        cell.setCellValue( s.split("204")[0]);
                                    }else if (s.contains("205")) {
                                        cell.setCellValue( s.split("205")[0]);
                                    }else if (s.contains("206")) {
                                        cell.setCellValue( s.split("206")[0]);
                                    }else if (s.contains("207")) {
                                        cell.setCellValue( s.split("207")[0]);
                                    }else if (s.contains("208")) {
                                        cell.setCellValue( s.split("208")[0]);
                                    }else if (s.contains("209")) {
                                        cell.setCellValue( s.split("209")[0]);
                                    }else if (s.contains("210")) {
                                        cell.setCellValue( s.split("210")[0]);
                                    }


                                  }}
                            rownum++;
                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("взял за все время");

                            cell = row.createCell(1, CellType.STRING);
                            cell.setCellValue(scet);

                            rownum++;
                            row = sheet.createRow(rownum);


                            cell = row.createCell(0, CellType.STRING);
                            cell.setCellValue("еще не вернул:");

                            for (int i = 0; i < reportArray.size(); i++) {
                                cell = row.createCell(1, CellType.STRING);
                                cell.setCellValue(reportArray.get(i));
                                rownum++;
                                row = sheet.createRow(rownum);
                            }

                            File file = (Gdx.files.absolute(reportString.getText() +"/"+reportName.split("///")[0]+" " +reportName.split("///")[1]+" cтатистика до "  + (new GregorianCalendar()).getTime().toString().split(":")[0]+" "+(new GregorianCalendar()).getTime().toString().split(":")[1]+" "+(new GregorianCalendar()).getTime().toString().split(":")[2]+ ".xlsx").file());
                            file.getParentFile().mkdirs();

                            FileOutputStream outFile = new FileOutputStream(file);
                            workbook.write(outFile);

                        } catch (IOException ex) {
                            System.out.println(ex);

                            delrep = false;
                        }


                    } else {
                        reportString.setText(null);
                        reportString.setMessageText("такого пути не существует");
                    }


                    if (delrep) {
                        reportСompleted.setText("отчет успешно сохранен\n" +
                                pathReport);
                    } else {
                        reportСompleted.setText("ошибка сохранения отчета");
                    }
                } else {
                    reportСompleted.setText("укажите, на кого сделать отчет");
                }

            }});
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
                stage.addActor(StringErrorReportTable);
                report.setColor(Color.RED);
                reportOnNameOn = false;
                readersOnReportMenuTable.clear();
                stage.addActor(readersOnReportMenuTable);
                stage.addActor(reportBookTable);
                readersOnReportMenuTable.add(reportYearsName).pad(2).row();
                reportCharName.setSelected(0);
                reportNameName.setSelected(0);
                reportYearsName.setSelected(0);
                reportBookTable.clear();
                reportBookTable.add(reportGenreBook).pad(2).row();
                reportString.setMessageText(" путь до отчета(по умолчанию загрузки)");
                reportString.setColor(Color.WHITE);
                report.setColor(Color.RED);

            }
        });
        saveError = new Label("", skinTree);
        mainMenuTable.add(saveError).pad(2);
        saveButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                try {
                    Library.saveAll();
                    saveError.setText("сохранено");
                } catch (Exception e) {
                    saveError.setText("ошибка сохранения");
                }

                saveButton.setColor(Color.WHITE);

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

                dolg.setColor(Color.RED);
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

                returnBook.setColor(Color.RED);

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

                newReader.setColor(Color.RED);

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
                giveBook.setColor(Color.RED);
            }
        });
        onHands.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                allBookBoolean = false;
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
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
                onHands.setColor(Color.RED);
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
                readers.setColor(Color.RED);

            }
        });


        allBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                stage.clear();
                stage.addActor(mainMenuTable);
                if (!allBookBoolean) {
                    allBookBoolean = true;
                    allBookListUpdate();
                }

                stage.addActor(tableListAllBook);
                allBookListUpdate();

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
                deleteTable.setPosition(700, 180);
                deleteTable.add(redactButton).pad(2).row();
                deleteTable.add(deleteButton);
                allBook.setColor(Color.RED);
            }
        });

        myBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                allBookBoolean = false;
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
                myBook.setColor(Color.RED);


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
                newBook.setColor(Color.RED);

            }
        });

    }

    public static void logNewString(String str) {
        try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/report.txt")).file(), true)) {

            writer.write(str);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
        }
        if (str.contains("выдана") || str.contains("вернул")) {
            try (FileWriter writer = new FileWriter((Gdx.files.external("/.prefs/Library/reportGiverBook.txt")).file(), true)) {
                writer.write(str);
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
            }
        }


    }


    public boolean chekNoNormalName(String name) {
        if (
                name.contains("q") || name.contains("w") || name.contains("e") || name.contains("r") || name.contains("t") || name.contains("y") ||
                        name.contains("u") || name.contains("i") || name.contains("o") || name.contains("p") || name.contains("a") || name.contains("s") ||
                        name.contains("d") || name.contains("f") || name.contains("g") || name.contains("h") || name.contains("j") || name.contains("k") ||
                        name.contains("l") || name.contains("z") || name.contains("x") || name.contains("c") || name.contains("v") || name.contains("b") ||
                        name.contains("n") || name.contains("m") || name.contains("Q") || name.contains("W") || name.contains("E") || name.contains("R") ||
                        name.contains("T") || name.contains("Y") || name.contains("U") || name.contains("I") || name.contains("O") || name.contains("P") ||
                        name.contains("A") || name.contains("S") || name.contains("D") || name.contains("F") || name.contains("G") || name.contains("H") ||
                        name.contains("J") || name.contains("K") || name.contains("L") || name.contains("Z") || name.contains("X") || name.contains("C") ||
                        name.contains("V") || name.contains("B") || name.contains("N") || name.contains("M") || name.contains("Й") || name.contains("Ц") ||
                        name.contains("У") || name.contains("К") || name.contains("Е") || name.contains("Н") || name.contains("Г") || name.contains("Ш") ||
                        name.contains("Щ") || name.contains("З") || name.contains("Х") || name.contains("Ъ") || name.contains("Ф") || name.contains("Ы") ||
                        name.contains("Л") || name.contains("О") || name.contains("Р") || name.contains("П") || name.contains("А") || name.contains("В") ||
                        name.contains("Д") || name.contains("Ж") || name.contains("Э") || name.contains("Ю") || name.contains("Б") || name.contains("Ь") ||
                        name.contains("Я") || name.contains("Ч") || name.contains("С") || name.contains("М") || name.contains("И") || name.contains("Т") ||
                        name.contains("я") || name.contains("б") || name.contains("й") || name.contains("ц") || name.contains("-") || name.contains("1") ||
                        name.contains("ч") || name.contains("ю") || name.contains("ф") || name.contains("у") || name.contains("Ё") || name.contains("2") ||
                        name.contains("с") || name.contains("э") || name.contains("ы") || name.contains("к") || name.contains("ё") || name.contains("3") ||
                        name.contains("м") || name.contains("ж") || name.contains("в") || name.contains("е") || name.contains("ъ") || name.contains("4") ||
                        name.contains("и") || name.contains("д") || name.contains("а") || name.contains("н") || name.contains("х") || name.contains("5") ||
                        name.contains("т") || name.contains("л") || name.contains("п") || name.contains("г") || name.contains("з") || name.contains("6") ||
                        name.contains("ь") || name.contains("о") || name.contains("р") || name.contains("ш") || name.contains("щ") || name.contains("7") ||
                        name.contains("8") || name.contains("9")

        ) {
            return false;
        } else {
            return true;
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

                error = new Label(" ", skinTree, "red");

                nameBook.setColor(1, 1, 1, 1);
                author.setColor(1, 1, 1, 1);
                number.setColor(1, 1, 1, 1);

                noError = true;

                addNewBookTable.clear();
                if (chekNoNormalName(nameBook.getText()) || chekNoNormalName(author.getText())) {
                    noError = false;
                    error = new Label("автор или название не имеет букв", skinTree);
                    addNewBookTable.add(number).pad(0, 0, 0, 50);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                    addNewBookTable.add(error).fill().pad(0, 4, 0, 0);
                }
                try {
                    Integer.parseInt(number.getText());
                    if (Integer.parseInt(number.getText()) <= 0) {
                        Integer.parseInt("шо опять");
                    }
                } catch (NumberFormatException e) {
                    number.setText(null);
                    noError = false;

                    error = new Label("Количество должно быть числом", skinTree);
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
                        error = new Label("Неправильный путь", skinTree);
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
                    error = new Label(" Заполните обязательные поля", skinTree, "red");

                    addNewBookTable.add(number).pad(0, 0, 0, 0);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                    addNewBookTable.add(error).fill().pad(0, 4, 0, 0);
                }
                if (noError) {
                    if (Integer.parseInt(number.getText()) > 200) {

                        error.clear();
                        addNewBookTable.clear();
                        noError = false;
                        error = new Label(" максимум 200 книг за раз", skinTree, "red");

                        addNewBookTable.add(number).pad(0, 0, 0, 0);
                        addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                        addNewBookTable.add(error).fill().pad(0, 4, 0, 0);
                    }
                }


                if (noError) {
                    if (!pathToImage.getText().equals("")) {
                        Gdx.files.absolute(pathToImage.getText()).copyTo(Gdx.files.external("/.prefs/Library/cover/" + nameBook.getText() + author.getText() + ".png"));
                    }



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

                    logNewString((new GregorianCalendar()).getTime() + " новая книга " + nameBook.getText() + "///" +
                            author.getText() + "///" + genre.getSelected() + " в количестве" + Integer.parseInt(number.getText()) + " штук");

                    logNewString((new GregorianCalendar()).getTime() + " новая книга " + nameBook.getText() + "///" +
                            author.getText() + "///" + genre.getSelected() + " в количестве" + Integer.parseInt(number.getText()) + " штук");
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
                    allBook.setColor(Color.RED);
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
                    deleteTable.setPosition(700, 180);
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
                    //allALLBookScrollPaneTable = tableListAllBook;
                    genreSearch.setItems(" Неопределенный жанр", " Учебники[" + genre1 + "]", " Классика[" + genre2 + "]", " Детская литература[" + genre3 + "]", " Справочная литература[" + genre4 + "]", " Зарубежная литература[" + genre5 + "]");
                    numberAllBook.setText(" " + bookArrayList.size());
                    bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));

                }
            }
        });

    }




    public void allDolgListUpdate() {
        getAuthorForSearch();
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


                    if (((book.reader.equals(readersArrayList.get(i))) &&
                            (book.dataOfGiven.getTimeInMillis() + 1.21e+9 < nowData.getTimeInMillis()) && (!book.genre.equals(" Учебники") || ((book.dataOfGiven.getTimeInMillis() + 5.256e+9 < nowData.getTimeInMillis()) && ((nowData.getTime().getMonth() == Calendar.JULY || (nowData.getTime().getMonth() == Calendar.JUNE) || (nowData.getTime().getMonth() == Calendar.AUGUST)))) || (book.dataOfGiven.getTimeInMillis() + 2.628e+10 < nowData.getTimeInMillis())))
                    ) {

                        if (readersArrayList.get(i).yearsLern >= 12) {
                            newReaderAdded = new TextButton(" " + readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " сотрудник ", skinTree, "textbuttonlist");
                        } else {
                            newReaderAdded = new TextButton(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                    readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass, skinTree, "textbuttonlist");
                        }
                        newReaderAdded.setName(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass);
                        newReaderAdded.addListener(new ChangeListener() {
                            @Override
                            public void changed(ChangeEvent event, Actor actor) {
                                saveError.setText("");
                                for (Actor item : allReaderScrollPaneTable.getChildren().items) {
                                    if (item != null) {
                                        if (item.getName().equals(lastButtonName)) {
                                            item.setColor(Color.WHITE);

                                        }
                                    }
                                }
                                for (int i = 0; i < readersArrayList.size(); i++) {
                                    if ((readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                            readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass).equals(actor.getName())) {
                                        index = i;

                                        chooseObject = true;
                                        WhatBookHeHaveDolg(readersArrayList.get(i));
                                        dolgBook.setItems(textFieldBooks);
                                        actor.setColor(Color.RED);
                                        lastButtonName = actor.getName();
                                    }
                                }
                            }
                        });
                        allReaderScrollPaneTable.add(newReaderAdded).fill(1.5f, 1).pad(2).row();
                    }
                } catch (NullPointerException e) {
                }
            }
        }
    }

    public void allBookOnHendListUpdate() {
        getAuthorForSearch();
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
            if (!bookArrayList.get(i).name.contains(nameBookSearch.getText()) && (!Objects.equals(nameBookSearch.getText(), ""))) {
                bookExclusive = false;
            }
            if (!(genreSearch.getSelected().toString().contains(bookArrayList.get(i).genre)) && (genreSearch.getSelectedIndex() != 0)) {
                bookExclusive = false;
            }
            if (!(bookArrayList.get(i).author.contains(authorSearch.getSelected().toString())) && (authorSearch.getSelectedIndex() != 0)) {
                bookExclusive = false;
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


                    newBookAdded = new TextButton(nameNewBookButton, skinTree, "textbuttonlist");


                    newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                    newBookAdded.addListener(new ChangeListener() {
                        @Override
                        public void changed(ChangeEvent event, Actor actor) {
                            saveError.setText("");
                            for (Actor item : allBookScrollPaneTable.getChildren().items) {
                                if (item != null) {
                                    if (item.getName().equals(lastButtonName)) {
                                        item.setColor(Color.WHITE);

                                    }
                                }
                            }
                            bookNumber = 0;
                            bookNumberOfHend = 0;
                            chooseObject = false;
                            for (int i = 0; i < bookArrayList.size(); i++) {
                                if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                    index = i;
                                    if (!chooseObject) {
                                        actor.setColor(Color.RED);
                                        lastButtonName = actor.getName();
                                        readerThisBookUpdate(bookArrayList.get(i));
                                        chooseObject = true;
                                    }
                                    bookNumber++;
                                    if (bookArrayList.get(i).dataOfGiven == null) {
                                        bookNumberOfHend++;
                                    }
                                }
                            }
                        }
                    });
                    allBookScrollPaneTable.add(newBookAdded).fill(1, 1).pad(2).row();
                }
            }
        }
    }

    public void allBookOnMyHendListUpdate() {
        getAuthorForSearch();
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
            if (!bookArrayList.get(i).name.contains(nameBookSearch.getText()) && (!Objects.equals(nameBookSearch.getText(), ""))) {
                bookExclusive = false;
            }
            if (!(genreSearch.getSelected().toString().contains(bookArrayList.get(i).genre)) && (genreSearch.getSelectedIndex() != 0)) {
                bookExclusive = false;
            }
            if (!(bookArrayList.get(i).author.contains(authorSearch.getSelected().toString())) && (authorSearch.getSelectedIndex() != 0)) {
                bookExclusive = false;
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

                newBookAdded = new TextButton(nameNewBookButton, skinTree, "textbuttonlist");

                newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                newBookAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        saveError.setText("");
                        for (Actor item : allBookScrollPaneTable.getChildren().items) {
                            if (item != null) {
                                if (item.getName().equals(lastButtonName)) {
                                    item.setColor(Color.WHITE);

                                }
                            }
                        }
                        bookNumber = 0;
                        bookNumberOfHend = 0;
                        chooseObject = false;
                        for (int i = 0; i < bookArrayList.size(); i++) {
                            if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                index = i;
                                if (!chooseObject) {
                                    actor.setColor(Color.RED);
                                    lastButtonName = actor.getName();
                                    readerThisBookUpdate(bookArrayList.get(i));
                                    chooseObject = true;
                                }
                                bookNumber++;
                                if (bookArrayList.get(i).dataOfGiven == null) {
                                    bookNumberOfHend++;
                                }
                            }
                        }
                    }
                });
                allBookScrollPaneTable.add(newBookAdded).fill(1, 1).pad(2).row();
            }
        }
    }

    public void allBookListUpdate() {
        getAuthorForSearch();

        allBookScrollPaneTable.clear();

        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive = true;
            for (Actor child : allBookScrollPaneTable.getChildren()) {
                if (child.getName().equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {
                    bookExclusive = false;
                }
            }
            updateBookHelp(i);
        }
    }


    public static void updateBookHelp(int i) {


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

                newBookAdded = new TextButton(nameNewBookButton, skinTree, "textbuttonlist");
                ;
                newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                newBookAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        saveError.setText("");


                        for (Actor item : allBookScrollPaneTable.getChildren().items) {
                            if (item != null) {
                                if (item.getName().equals(lastButtonName)) {
                                    item.setColor(Color.WHITE);
                                    break;
                                }
                            }
                        }
                        bookNumber = 0;
                        bookNumberOfHend = 0;
                        chooseObject = false;
                        for (int i = 0; i < bookArrayList.size(); i++) {
                            if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                index = i;

                                if (!chooseObject) {
                                    actor.setColor(Color.RED);
                                    lastButtonName = actor.getName();
                                    readerThisBookUpdate(bookArrayList.get(i));
                                    chooseObject = true;
                                }
                                bookNumber++;
                                if (bookArrayList.get(i).dataOfGiven == null) {
                                    bookNumberOfHend++;
                                }


                            }
                        }
                    }
                });
                allBookScrollPaneTable.add(newBookAdded).fill(1, 1).pad(2).row();
            }
        }

    }

    public static void allBookListFullUpdate() {
        getAuthorForSearch();

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
            for (Actor child : allBookScrollPaneTable.getChildren()) {
                if (child.getName().equals(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre)) {
                    bookExclusive = false;
                }
            }
            updateBookHelp(i);
        }

    }

    public static void readerThisBookUpdate(Book thisBook) {

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

    // TODO: 16.01.2022  переделать определение книги с индекса на распарсивоние имени кнопки
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


            if (readersArrayList.get(i).yearsLern > 12) {
                readersArrayList.get(i).yearsLern = 12;
            }
            ;

            if (((nameReaderSearch.getText().equals("")) || (readersArrayList.get(i).name.contains(nameReaderSearch.getText())))
                    && ((surnameReaderSearch.getText().equals("")) || (readersArrayList.get(i).surname.contains(surnameReaderSearch.getText())))
                    && ((yearsSearch.getSelectedIndex() == 0) || (((readersArrayList.get(i).yearsLern + " класс").equals(yearsSearch.getSelected()) && (readersArrayList.get(i).yearsLern < 12)) || (((" Сотрудник").equals(yearsSearch.getSelected()))) && (readersArrayList.get(i).yearsLern > 11)))
                    && ((yearsCharSearch.getSelectedIndex() == 0) || (readersArrayList.get(i).charClass.equals(yearsCharSearch.getSelected())))) {

                if (readersArrayList.get(i).yearsLern >= 12 && (yearsCharSearch.getSelectedIndex() == 0)) {
                    newReaderAdded = new TextButton(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " Cотрудник", skinTree, "textbuttonlist");

                } else {
                    newReaderAdded = new TextButton(" " + readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass + " ", skinTree, "textbuttonlist");
                }
                newReaderAdded.setName(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass);
                newReaderAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        saveError.setText("");
                        for (Actor item : allReaderScrollPaneTable.getChildren().items) {
                            if (item != null) {
                                if (item.getName().equals(lastButtonName)) {
                                    item.setColor(Color.WHITE);
                                }
                            }
                        }
                        for (int i = 0; i < readersArrayList.size(); i++) {
                            if ((readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " +
                                    readersArrayList.get(i).yearsLern + " " + readersArrayList.get(i).charClass).equals(actor.getName())) {
                                index = i;
                                WhatBookHeHave(readersArrayList.get(i));
                                bookThisReader.setItems(textFieldBooks);
                                chooseObject = true;
                                actor.setColor(Color.RED);
                                lastButtonName = actor.getName();
                            }
                        }
                    }
                });
                allReaderScrollPaneTable.add(newReaderAdded).fill(1.5f, 1).pad(2).row();
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




                    textFieldBooks.add((nameNewBookButton));
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
        classReader.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудник");
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

                if ((nameReader.getText().equals("")) || (surnameReader.getText().equals("")) || (patronymicReader.getText().equals("")) || (chekNoNormalName(nameReader.getText()) || chekNoNormalName(surnameReader.getText()) || chekNoNormalName(patronymicReader.getText()))) {
                    errorNewReader.setText(" Заполните обязательные поля");
                    if ((nameReader.getText().equals(""))) {
                        nameReader.setColor(Color.RED);
                    }
                    if ((surnameReader.getText().equals(""))) {
                        surnameReader.setColor(Color.RED);
                    }
                    if ((patronymicReader.getText().equals(""))) {
                        patronymicReader.setColor(Color.RED);
                    }

                    if (chekNoNormalName(nameReader.getText()) || chekNoNormalName(surnameReader.getText()) || chekNoNormalName(patronymicReader.getText())) {

                        errorNewReader.setText("фио не имеет букв");

                    }

                    newReaderTable.add(errorNewReader).fillX();

                } else {

                    if (charClass.getText().equals("")) {
                        readersArrayList.add(new Readers(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, "a"));
                        Library.saveNewReader(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, "a");
                        if (classReader.getSelectedIndex() > 10) {
                            logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + "///сотрудник");

                        } else {
                            logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + "///" + classReader.getSelectedIndex() + 1 + " " + "a");
                        }
                    } else{
                        readersArrayList.add(new Readers(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, charClass.getText()));
                    Library.saveNewReader(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1, charClass.getText());

                    if (classReader.getSelectedIndex() > 10) {
                        logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + "///сотрудник");

                    } else {
                        logNewString((new GregorianCalendar()).getTime() + " новая персона " + surnameReader.getText() + " " + nameReader.getText() + "///" + classReader.getSelectedIndex() + 1 + " " + charClass.getText());
                    }}
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
                    allBook.setColor(Color.RED);
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
                    deleteTable.setPosition(700, 180);
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
        giveBookKlassButton = new TextButton(" Выдать книгу всему классу ", skinTree);
        giveBookButtonTable.add(giveBookButton).pad(10);
        giveBookButtonTable.add(giveBookKlassButton);
        erorTextField = new TextField("", skinTree);
        erorTextField.setDisabled(true);

        giveBookKlassButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                erorTextField.setText(" для этих учеников не хватило книг:");

                erorTextField.setWidth(35);
                if ((bookOnGivMenuTable.getRows() == 3) && (readersOnGivMenuTable.getRows() >= 2)) {
                    for (Readers value : readersArrayList) {
                        bookDetected = false;
                        if (("" + value.yearsLern).equals("" +
                                (int) (classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1))) {

                            if (erorTextField.getWidth() == 35) {
                                for (Book book : bookArrayList) {

                                    if ((book.author.equals(authorOfBookOnGivMenuSelectBox.getSelected())) &&
                                            (book.name.equals(nameOfBookOnGivMenuSelectBox.getSelected())) &&
                                            (book.genre.equals(genreOfBookOnGivMenuSelectBox.getSelected())) &&
                                            (book.dataOfGiven == null)) {
readerThisBookUpdate(book);

                                        if (readerBookArrey.contains(" " + value.surname + " " + value.name,false)){
                                            bookDetected = true;
                                            break;
                                        }


                                        if (classOfReadersOnGivMenuSelectBox.getSelectedIndex() >= 10) {

                                            book.giveBook(value);
                                            bookOnHendNumberInt++;
                                            if (value.yearsLern > 11) {
                                                logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///сотрудник");

                                            } else {
                                                logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///" + value.yearsLern + " " + value.charClass);
                                            }

                                            Library.saveBookGiver(bookArrayList.indexOf(book), book.dataOfGiven.getWeekYear(), book.dataOfGiven.getTime().getMonth()
                                                    , book.dataOfGiven.getTime().getDate(), value.name, value.surname, value.patronymic, value.yearsLern, value.charClass);

                                            bookDetected = true;
                                            break;

                                        } else if (("" + value.charClass).equals((String) charClassGivMenu.getSelected())) {

                                            book.giveBook(value);
                                            bookOnHendNumberInt++;
                                            if (value.yearsLern > 11) {
                                                logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///сотрудник");

                                            } else {
                                                logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///" + value.yearsLern + " " + value.charClass);

                                            }

                                            Library.saveBookGiver(bookArrayList.indexOf(book), book.dataOfGiven.getWeekYear(), book.dataOfGiven.getTime().getMonth()
                                                    , book.dataOfGiven.getTime().getDate(), value.name, value.surname, value.patronymic, value.yearsLern, value.charClass);

                                            bookDetected = true;
                                            break;
                                        }
                                    }
                                }
                            }

                            if (!bookDetected) {
                                if (erorTextField.getText().length() < 90) {
                                    if (erorTextField.getText().length() == 27) {
                                        erorTextField.setText(erorTextField.getText() + value.surname + " " + value.name);

                                    } else {
                                        erorTextField.setText(erorTextField.getText() + ", " + value.surname + " " + value.name);

                                    }
                                    erorTextField.setColor(Color.RED);
                                    erorTextField.setWidth(1335);
                                    erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - erorTextField.getWidth() / 2, 20);
                                    stage.addActor(erorTextField);
                                }
                            }


                        }
                    }
                    if (erorTextField.getWidth() != 1335) {
                        stage.clear();
                        meinMenuUsed();
                        stage.addActor(mainMenuTable);
                        stage.addActor(tableListAllBook);
                        allBook.setColor(Color.RED);
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
                        deleteTable.setPosition(700, 180);
                        deleteTable.add(redactButton).pad(2).row();
                        deleteTable.add(deleteButton);
                        allBookScrollPaneTable.clear();
                        bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));
                        bookOnHendNumber.setText(" " + bookOnHendNumberInt);
                        allBookOnMyHendListUpdate();
                    } else {
                        stage.clear();
                        meinMenuUsed();
                        stage.addActor(mainMenuTable);
                        stage.addActor(tableListAllBook);
                        allBook.setColor(Color.RED);
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
                        deleteTable.setPosition(700, 180);
                        deleteTable.add(redactButton).pad(2).row();
                        deleteTable.add(deleteButton);
                        allBookScrollPaneTable.clear();
                        bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));
                        bookOnHendNumber.setText(" " + bookOnHendNumberInt);
                        allBookOnMyHendListUpdate();
                        stage.addActor(erorTextField);
                    }
                    if ((erorTextField.getText().length() >= 90)) {
                        erorTextField.setText(erorTextField.getText() + " и др. ");

                    }


                } else {
                    stage.clear();
                    stage.addActor(mainMenuTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(giveBookButtonTable);
                    stage.addActor(readersOnGivMenuTable);
                    stage.addActor(bookOnGivMenuTable);
                    erorTextField.setText(" " + "Выберите книгу и класс");
                    erorTextField.setColor(Color.RED);
                    erorTextField.setWidth(335);
                    erorTextField.setPosition(Gdx.graphics.getWidth() / 2 - erorTextField.getWidth() / 2, 20);
                    stage.addActor(erorTextField);
                }

            }
        });


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

                                if (classOfReadersOnGivMenuSelectBox.getSelectedIndex() > 10) {
                                    if ((value.surname + " " + value.name + value.yearsLern)
                                            .equals(surnameOfReadersOnGivMenuSelectBox.getSelected() +
                                                    "" +
                                                    (int) (classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1))) {
                                        book.giveBook(value);
                                        if (value.yearsLern > 11) {
                                            logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///сотрудник");

                                        } else {
                                            logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///" + value.yearsLern + " " + value.charClass);

                                        }

                                        Library.saveBookGiver(bookArrayList.indexOf(book), book.dataOfGiven.getWeekYear(), book.dataOfGiven.getTime().getMonth()
                                                , book.dataOfGiven.getTime().getDate(), value.name, value.surname, value.patronymic, value.yearsLern, value.charClass);


                                        break;
                                    }
                                } else if ((value.surname + " " + value.name + value.charClass + value.yearsLern)
                                        .equals(surnameOfReadersOnGivMenuSelectBox.getSelected() +
                                                (String) charClassGivMenu.getSelected() +
                                                (int) (classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1))) {
                                    book.giveBook(value);
                                    if (value.yearsLern > 11) {
                                        logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///сотрудник");

                                    } else {
                                        logNewString((new GregorianCalendar()).getTime() + " книга:" + book.author + "///" + book.name + " выдана " + value.surname + " " + value.name + "///" + value.yearsLern + " " + value.charClass);

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
                            allBook.setColor(Color.RED);
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
                            deleteTable.setPosition(700, 180);
                            deleteTable.add(redactButton).pad(2).row();
                            deleteTable.add(deleteButton);
                            allBookScrollPaneTable.clear();
                            bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));
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


        classOfReadersOnGivMenuSelectBox.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудник");

        readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
        classOfReadersOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                charOfClassByYears(classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1);
                charClassGivMenu.setItems(charOfClassArray);

                readersOnGivMenuTable.clear();

                readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                if (classOfReadersOnGivMenuSelectBox.getSelectedIndex() == 11) {
                    getReadersSurnameByClass(classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1, "");
                    surnameOfReadersOnGivMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());

                    readersOnGivMenuTable.clear();

                    readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                    readersOnGivMenuTable.add().row();
                    readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();
                } else {
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
                if (classOfReadersOnGivMenuSelectBox.getSelectedIndex() == 11) {
                    readersOnGivMenuTable.clear();
                    readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                    readersOnGivMenuTable.add().row();
                    readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();
                } else {
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
        classOfReadersOnReturnMenuSelectBox.setItems(" 1 класс", " 2 класс", " 3 класс", " 4 класс", " 5 класс", " 6 класс", " 7 класс", " 8 класс", " 9 класс", " 10 класс", " 11 класс", " сотрудник");

        returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
        charClassReturnMenu = new SelectBox(skinTree);

        classOfReadersOnReturnMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                charOfClassByYears(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1);

                returnMenuTable.clear();
                returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                if (classOfReadersOnReturnMenuSelectBox.getSelectedIndex() == 11) {
                    getReadersSurnameByClass(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1, "");
                    surnameOfReadersOnReturnMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                } else {
                    charClassReturnMenu.setItems(charOfClassArray);
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
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
                if (classOfReadersOnReturnMenuSelectBox.getSelectedIndex() == 11) {
                    getBookByName(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1,
                            (String) surnameOfReadersOnReturnMenuSelectBox.getSelected(), "");
                    bookOnReturnMenuSelectBox.setItems(bookReturnArrayList.toArray());
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add().row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).size(150, 50).row();
                } else {
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
                if (classOfReadersOnReturnMenuSelectBox.getSelectedIndex() == 11) {
                    returnMenuTable.clear();
                    returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add().row();
                    returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                    returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).size(150, 50).row();
                    returnMenuTable.add(returnBookButton).pad(2).row();
                } else {
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
                            ((reader.charClass.equals(charClassReturnMenu.getSelected())) || classOfReadersOnReturnMenuSelectBox.getSelectedIndex() >= 11)) {
                        for (Book book : bookArrayList) {

                            if ((((book.author + " " + book.name).equals(bookOnReturnMenuSelectBox.getSelected()))) && (book.giveThisReader(reader))) {
                                if (reader.yearsLern > 11) {
                                    logNewString((new GregorianCalendar()).getTime() + " книгу:" + book.author + "///" + book.name + " вернул " + reader.surname + " " + reader.name + "///сотрудник");

                                } else {
                                    logNewString((new GregorianCalendar()).getTime() + " книгу:" + book.author + "///" + book.name + " вернул " + reader.surname + " " + reader.name + "///" + reader.yearsLern + " " + reader.charClass);
                                }

                                stage.clear();
                                meinMenuUsed();
                                stage.addActor(mainMenuTable);
                                stage.addActor(tableListAllBook);
                                allBook.setColor(Color.RED);
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
                                deleteTable.setPosition(700, 180);
                                deleteTable.add(redactButton).pad(2).row();
                                deleteTable.add(deleteButton);
                                allBookListUpdate();
                                book.returnBook();
                                Library.saveBookReturn(bookArrayList.indexOf(book));
                                bookOnHendNumber.setText(" " + bookOnHendNumberInt);
                                bookOnLibrary.setText(" " + (bookArrayList.size() - bookOnHendNumberInt));
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