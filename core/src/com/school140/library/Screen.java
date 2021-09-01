package com.school140.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Screen {
    Skin skinTree;
static String descriptionString;
    static Stage stage;
    ScrollPane allBookScrollPane;
    ScrollPane descriptionScrollPane;
    static Table descriptionInfoTable= new Table();
    List allBookList;
    List allReaderList;
    static public int bookNumber;
    static public int bookNumberOfHend;

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
    TextButton newBookAdded;
    TextButton newBook;
    TextButton newReader;
    boolean noNullPointerException = true;
    SelectBox sort;
    boolean noError = true;
    TextButton giveBook;
    TextButton returnBook;
    TextButton dolg;
    TextButton allBook;
    TextButton myBook;
    TextButton onHands;
    TextButton readers;
    Table infoMenuBookOnHend=new Table();

    static Label error;
    static int numberOfBook;
    static TextField nameBook;
    static int infoMenuTip = 1;
    static boolean authorAdded;
    static TextField authorWindow;
    static TextField nameBookWindow;
    static TextField numberWindow;
    static Texture imageWindow;
    static TextField genreWindow;
int timeDolg=14;
static int bookOnHendNumberInt=0;
// TODO: 17.08.2021 сделать сохранение  bookArrayList readersArrayList timeDolg и bookOnHendNumberInt;

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

    static SelectBox genreOfBookOnGivMenuSelectBox;
    static SelectBox bookOnReturnMenuSelectBox;
    static SelectBox authorOfBookOnGivMenuSelectBox;
    static SelectBox nameOfBookOnGivMenuSelectBox;
    static SelectBox classOfReadersOnGivMenuSelectBox;
    static SelectBox surnameOfReadersOnGivMenuSelectBox;
    static SelectBox classOfReadersOnReturnMenuSelectBox;
    static SelectBox surnameOfReadersOnReturnMenuSelectBox;
    static Table giveBookButtonTable = new Table();
    static TextButton giveBookButton;
    static ArrayList<String> authorOfBookOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> nameOfBookOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> surnameOfReadersOnGivMenuArrayList = new ArrayList<>();
    static ArrayList<String> bookReturnArrayList = new ArrayList<>();
TextButton returnBookButton;

    static TextField nameReaderWindowPreName;
    static TextField surnameReaderWindowPreName;
    static TextField numberBookOfHendWindowPreName;
    static TextField numberBookOfHendWindow;
    static TextField patronymicReaderWindowPreName;
    static TextField nameReaderWindow;
    static TextField surnameReaderWindow;
    static TextField patronymicReaderWindow;
    static TextField classReaderWindow;
static  boolean bookExclusive;
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
    TextButton addNewReader;
    TextField author;
    TextField number;
    static double imgX;
    static double imgY;

    TextField pathToImage;
    SelectBox genre;
    TextField description;
    TextButton bookAdded;
    static Skin skin;
    static Texture coverBook;
    static ArrayList<Book> bookArrayList = new ArrayList<>();
    static ArrayList<Readers> readersArrayList = new ArrayList<>();
    Table allReaderScrollPaneTable = new Table();
    ScrollPane allReaderScrollPane;
    TextButton newReaderAdded;
     boolean haveBoolean;
     Table descriptionWindowTable2;

    public Screen() {

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

skinTree= new Skin(Gdx.files.internal("TreeButton/TreeButton2.json"));
        skin = new Skin(Gdx.files.internal("default/skin/uiskin.json"));


        meinMenu();
        allBookMenu();
        allReaderMenu();
        newBookMenu();
        newReaderMenu();
        giveBookMenu();
        returnBookMenu();
        infoMenu();

        stage.addActor(mainMenuTable);
        coverBook = new Texture(Gdx.files.internal("noimg.png"));
    }

    public static void imgRender(SpriteBatch batch) {

        if ((infoMenuTip == 1)||(infoMenuTip == 3)) {

           batch.draw(imageWindow, (Gdx.graphics.getWidth() -(int)imgX )/2, Gdx.graphics.getHeight() / 2,
                    Gdx.graphics.getWidth()/5, (int)(Gdx.graphics.getWidth()/5*Math.sqrt(2) ));

        }

    }

    private void infoMenu() {

        authorWindowPreName = new TextField("автор:", skinTree);
        authorWindowPreName.setDisabled(true);
        numberWindowPreName = new TextField("количество:", skinTree);
        numberWindowPreName.setDisabled(true);
        numberBookOfHendWindowPreName = new TextField("в наличии:", skinTree);
        numberBookOfHendWindow = new TextField("0", skinTree);
        numberBookOfHendWindow.setDisabled(true);
        numberBookOfHendWindowPreName.setDisabled(true);
        genreWindowPreName = new TextField("жанр:", skinTree);
        genreWindowPreName.setDisabled(true);
//        descriptionWindowPreName = new TextField("оптисание:", skin);
//        descriptionWindowPreName.setDisabled(true);
        nameBookWindowPreName = new TextField("название:", skinTree);
        nameBookWindowPreName.setDisabled(true);

        infoMenuTable.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 3+nameBookWindowPreName.getHeight());


        infoMenu2Table.setPosition(Gdx.graphics.getWidth() / 4 * 3, Gdx.graphics.getHeight() / 2);
        nameReaderWindowPreName = new TextField("имя:", skinTree);

        surnameReaderWindowPreName = new TextField("фамилия:", skinTree);
        surnameReaderWindowPreName.setDisabled(true);
        patronymicReaderWindowPreName = new TextField("отчество:", skinTree);
        patronymicReaderWindowPreName.setDisabled(true);
        classReaderWindowPreName = new TextField("класс:", skinTree);
        classReaderWindowPreName.setDisabled(true);


        classReaderWindow = new TextField("класс", skinTree);
        classReaderWindow.setDisabled(true);
        nameReaderWindow = new TextField("имя", skinTree);
        surnameReaderWindow = new TextField("фамилия", skinTree);
        patronymicReaderWindow = new TextField("отчество", skinTree);
        nameReaderWindow.setDisabled(true);
        surnameReaderWindow.setDisabled(true);
        patronymicReaderWindow.setDisabled(true);
        infoMenu2Table.add(surnameReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(surnameReaderWindow).fill(1.8f,1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(nameReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(nameReaderWindow).fill(1.8f,1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(patronymicReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(patronymicReaderWindow).fill(1.8f,1).pad(2, 8, 2, 0).row();
        infoMenu2Table.add(classReaderWindowPreName).pad(2, 0, 2, 65);
        infoMenu2Table.add(classReaderWindow).fill(1.8f,1).pad(2, 8, 2, 0).row();
// TODO: 27.08.2021 сделать обложку
        // TODO: 27.08.2021 название и тд полностью

        authorWindow = new TextField("автор", skinTree);
        authorWindow.setDisabled(true);
        numberWindow = new TextField("0", skinTree);
        numberWindow.setDisabled(true);
        imageWindow = new Texture(Gdx.files.internal("noimg.png"));
        genreWindow = new TextField("жанр", skinTree);
        genreWindow.setDisabled(true);
        descriptionWindow = new Label("описание", skin);
// TODO: 27.08.2021 добавить список книг у каждого участника 

        nameBookWindow = new TextField("название", skinTree);
        nameBookWindow.setDisabled(true);
        infoMenuTable.add(nameBookWindowPreName).fill(1.1f,1).pad(2, 0, 2, 65);
        infoMenuTable.add(nameBookWindow).fill(1.7f,1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(authorWindowPreName).fill(1.1f,1).pad(2, 0, 2, 65);
        infoMenuTable.add(authorWindow).fill(1.7f,1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(genreWindowPreName).fill(1.1f,1).pad(2, 0, 2, 65);
        infoMenuTable.add(genreWindow).fill(1.7f,1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(numberWindowPreName).fill(1.1f,1).pad(2, 0, 2, 65);
        infoMenuTable.add(numberWindow).fill(1.7f,1).pad(2, 0, 2, 0).row();
        infoMenuTable.add(numberBookOfHendWindowPreName).fill(1.1f,1).pad(2, 0, 2, 65);
        infoMenuTable.add(numberBookOfHendWindow).fill(1.7f,1).pad(2, 0, 2, 0).row();
        descriptionWindowTable2=new Table();
        descriptionWindowTable2.add(descriptionWindow);

descriptionScrollPane=new ScrollPane(descriptionWindowTable2);
descriptionScrollPane.setScrollingDisabled(true,false);
       descriptionInfoTable.add(descriptionScrollPane).size(Gdx.graphics.getWidth()/3,Gdx.graphics.getHeight()/5);

       descriptionInfoTable.setPosition(Gdx.graphics.getWidth()/4*3,Gdx.graphics.getHeight() / 3+ Screen.nameBookWindowPreName.getHeight()-3*numberBookOfHendWindow.getHeight()-Gdx.graphics.getHeight()/10);

        stage.addActor(descriptionInfoTable);
        stage.addActor(infoMenuTable);

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
                    .size(Gdx.graphics.getWidth() / 3, Gdx.graphics.getHeight() - 2 * bookAdded.getHeight() - newBook.getHeight());


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
        numberAllBook.setText(String.valueOf(numberOfBook));
       readerNumber.setText(String.valueOf(readersArrayList.size()));
        bookOnHendNumber.setText(String.valueOf(bookOnHendNumberInt));
        bookOnLibrary.setText(String.valueOf(numberOfBook-bookOnHendNumberInt));

        numberAllBookTable.setPosition(2*numberAllBook.getWidth()+36
                , numberAllBook.getHeight() + 10);
        renderInfoMenu();
      //  System.out.println(index+" "+readersArrayList.size());
        stage.act();

        stage.draw();
    }

    private static void renderInfoMenu() {
        if (infoMenuTip == 1) {
            if (index != -1){
                if ((bookArrayList.size() != 0)&&(bookArrayList.size()>index)) {

                    bookNumber=0;
                    bookNumberOfHend=0;
                    for (int i = 0; i < bookArrayList.size(); i++) {
                        if ((bookArrayList.get(i).name.equals(bookArrayList.get(index).name))&&(bookArrayList.get(i).genre.equals(bookArrayList.get(index).genre))&&((bookArrayList.get(i).author.equals(bookArrayList.get(index).author)))){
                            bookNumber++;
                            if (bookArrayList.get(i).dataOfGiven==null){
                                bookNumberOfHend++;
                            }

                        }
                    }
                    if ((!bookArrayList.get(index).name.equals(nameBookWindow.getText())) ||
                            (!bookArrayList.get(index).genre.equals(genreWindow.getText())) ||
                            (!bookArrayList.get(index).author.equals(authorWindow.getText())) ||
                            (!bookArrayList.get(index).description.equals(descriptionWindow.getText())) ||
                            (!(numberWindow.getText().equals(bookNumber) ))){

                        authorWindow.setText(bookArrayList.get(index).author);


                        numberWindow.setText(String.valueOf(bookNumber));
                        numberBookOfHendWindow.setText(String.valueOf(bookNumberOfHend));


                        //  ISBNWindow.setText(bookArrayList.get(index).);
                        imageWindow = bookArrayList.get(index).coverBook;
                        genreWindow.setText(bookArrayList.get(index).genre);



                        descriptionWindow.setText(bookArrayList.get(index).description);
                        nameBookWindow.setText(bookArrayList.get(index).name);


                    }
                }


            }


        } else if (infoMenuTip == 2) {
            if (index != -1) {
                if ((readersArrayList.size() != 0)&&(readersArrayList.size()>index)) {
                    if (nameReaderWindow.getText().equals("")) {
                        if (!readersArrayList.get(index).name.equals(nameReaderWindow.getText())) {

                            if (!readersArrayList.get(index).surname.equals(surnameReaderWindow.getText())) {

                                if (!readersArrayList.get(index).patronymic.equals(patronymicReaderWindow.getText())) {


                                    patronymicReaderWindow.setText(readersArrayList.get(index).patronymic);
                                    surnameReaderWindow.setText(readersArrayList.get(index).surname);
                                    nameReaderWindow.setText(readersArrayList.get(index).name);
                                    classReaderWindow.setText(String.valueOf(readersArrayList.get(index).yearsLern));


                                }

                            }

                        }
                    } else {

                        patronymicReaderWindow.setText(readersArrayList.get(index).patronymic);

                        surnameReaderWindow.setText(readersArrayList.get(index).surname);
                        nameReaderWindow.setText(readersArrayList.get(index).name);
                        classReaderWindow.setText(String.valueOf(readersArrayList.get(index).yearsLern));
                    }
                }

            }
        }


    }


    public void meinMenu() {

        mainMenuTable.setFillParent(true);
        newBook = new TextButton("добавить книгу", skinTree);
        mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - newBook.getHeight() - 8);

        readerNumber = new TextField("0", skinTree);;
        bookOnHendNumber = new TextField("0", skinTree);;
        bookOnLibrary = new TextField("0", skinTree);;
        readerNumberPreName = new TextField("читателей:", skinTree);;
        bookOnHendNumberPreName = new TextField("книг выданно:", skinTree);;
        bookOnLibraryPreName = new TextField("книг в наличии:", skinTree);;
        bookOAllPreName = new TextField("книг:", skinTree);;
        numberAllBook = new TextField("0", skinTree);
        numberAllBookTable.setPosition(4*numberAllBook.getWidth()
                , numberAllBook.getHeight() + 10);



        newReader = new TextButton("добавить читателя", skinTree);
        giveBook = new TextButton("выдать книгу", skinTree);
        returnBook = new TextButton("вернуть книгу", skinTree);
        sort = new SelectBox(skinTree);
        dolg = new TextButton("должники", skinTree);
        allBook = new TextButton("все книги", skinTree);
        myBook = new TextButton("книги в наличии", skinTree);
        readers = new TextButton("все читатели", skinTree);
        onHands = new TextButton("книги на руках", skinTree);
        numberAllBookTable.add(bookOAllPreName).pad(2,1,2,1);
        numberAllBookTable.add(numberAllBook).pad(2,1,2,2);
        numberAllBookTable.add(bookOnLibraryPreName).pad(2,30,2,30).fill(1.4f,1);
        numberAllBookTable.add(bookOnLibrary).pad(2,2,2,2).row();
        numberAllBookTable.add(readerNumberPreName).pad(2,1,2,1);
        numberAllBookTable.add(readerNumber).pad(2,1,2,2);
        numberAllBookTable.add(bookOnHendNumberPreName).pad(2,30,2,30).fill(1.4f,1);
        numberAllBookTable.add(bookOnHendNumber).pad(2,1,2,1);
        mainMenuTable.add(newBook).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(newReader).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(giveBook).fillX().pad(0, 2, 0, 0);
        mainMenuTable.add(returnBook).fillX().pad(0, 2, 0, 0);
        mainMenuTable.row().pad(10, 0, 10, 0);
        mainMenuTable.add(allBook).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(myBook).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(readers).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(onHands).fillX().pad(2, 2, 0, 0);
        mainMenuTable.add(dolg).fillX().pad(2, 2, 0, 0);
        stage.addActor(numberAllBookTable);
        dolg.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
                stage.addActor(descriptionInfoTable);
                stage.addActor(infoMenuTable);
                infoMenuTip = 1;
                nowData=new GregorianCalendar();
                allBookOnHendDolgListUpdate();
                nowData.add(GregorianCalendar.DAY_OF_MONTH,-timeDolg);


            }
        });


        returnBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {


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
                surnameReader.setText("");
                patronymicReader.setText("");


            }
        });
        giveBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

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
        stage.addActor(descriptionInfoTable);
        stage.addActor(infoMenuTable);
        infoMenuTip = 1;
        allBookOnHendListUpdate();


    }
});

        readers.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                tableListAllReader.setPosition(Gdx.graphics.getWidth() / 4 + 10, Gdx.graphics.getHeight() / 2 - 30);
                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllReader);
                stage.addActor(numberAllBookTable);
                stage.addActor(infoMenu2Table);
                infoMenuTip = 2;

                allReaderListUpdate();


            }
        });



        allBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                stage.clear();
                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
                stage.addActor(descriptionInfoTable);
                stage.addActor(infoMenuTable);
                infoMenuTip = 1;
                allBookListUpdate();

            }
        });

        myBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                stage.clear();

                stage.addActor(mainMenuTable);
                stage.addActor(tableListAllBook);
                stage.addActor(numberAllBookTable);
                stage.addActor(infoMenuTable);
                infoMenuTip = 1;
                allBookScrollPaneTable.clear();

                    allBookOnMyHendListUpdate();



            }
        });

// TODO: 20.08.2021 инфоменю 3 книги выданные:добавить имена взявших книгу
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

    public void newBookMenu() {
        newBookTable.setFillParent(true);
        newBookTable.setPosition(0, 0);
        addNewBookTable.setFillParent(true);
        nameBook = new TextField("", skinTree);
        nameBook.setMessageText("название");
        addNewBookTable.setPosition(0, -5 * nameBook.getHeight());
        descriptionTable.setHeight(0.1f);
        descriptionTable.setFillParent(true);
        descriptionTable.setPosition(0, -3 * nameBook.getHeight());
        genre = new SelectBox(skinTree);
        genre.setItems("неопеделенный жанр", "учебники", "классика", "детская литература", "справочная литература", "зарубежная литература");
        bookAdded = new TextButton("добавить", skinTree);
        author = new TextField("", skinTree);
        number = new TextField("", skinTree);



        description = new TextField("", skinTree);
        author.setMessageText("автор");
        pathToImage = new TextField("", skinTree);
        pathToImage.setMessageText("путь до обложки");
        number.setMessageText("количество");

        description.setMessageText("описание");

        newBookTable.add(nameBook).fillX().pad(0, 0, 10, 0).row();
        newBookTable.add(author).fillX().pad(0, 0, 10, 0).row();
        newBookTable.add(genre).fillX().pad(0, 0, 10, 0).row();
        newBookTable.add(pathToImage).fill(1.5f, 1).pad(0, 0, 10, 0).row();
        descriptionTable.add(description).fill(6, 1).row();
        addNewBookTable.add(number).pad(0, 0, 0, 50);
        addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0);
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


                nameBook.setColor(1, 1, 1, 1);
                author.setColor(1, 1, 1, 1);
                number.setColor(1, 1, 1, 1);

                noError = true;

                addNewBookTable.clear();
                try {
                    Integer.parseInt(number.getText());
                } catch (NumberFormatException e) {
                    number.setText(null);

                    noError = false;

                    error = new Label("количество должно быть числом", skin);
                    addNewBookTable.add(number).pad(0, 0, 0, 50);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                    addNewBookTable.add(error).fill().pad(0, 4, 0, 0);

                }

                if (!pathToImage.getText().equals("")) {
                    try {
                        coverBook = new Texture(Gdx.files.absolute(pathToImage.getText()));
                    } catch (GdxRuntimeException e) {
                        pathToImage.setText(null);

                        noError = false;
                        error = new Label("неправильный путь", skin);
                        addNewBookTable.add(number).pad(0, 0, 0, 50);
                        addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                        addNewBookTable.add(error).fill().pad(0, 4, 0, 0);

                    }

                } else {
                    coverBook = new Texture(Gdx.files.internal("noimg.png"));
                }

                if ((nameBook.getText().equals("")) || (author.getText().equals("")) || (number.getText().equals(""))) {


                    error.clear();
                    addNewBookTable.clear();
                    noError = false;
                    error = new Label(" заполните обязательные поля", skin, "red");

                    addNewBookTable.add(number).pad(0, 0, 0, 0);
                    addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0).row();
                    addNewBookTable.add(error).fill().pad(0, 4, 0, 0);
                }

                if (noError) {
                    numberOfBook += Integer.parseInt(number.getText());





                        addNewBookTable.clear();
                        addNewBookTable.add(number).pad(0, 0, 0, 50);
                        addNewBookTable.add(bookAdded).fill().pad(0, 0, 0, 0);
                        if (!pathToImage.getText().equals("")) {
                            coverBook = new Texture(Gdx.files.absolute(pathToImage.getText()));
                        }
                    descriptionString=" ";
                    for (int i = 0; i < description.getText().length(); i++) {
                        descriptionString+=description.getText().charAt(i);
                        if (i%20==0){
                            descriptionString+="\n";
                        }
                    }
                        for (int i = 0; i < Integer.parseInt(number.getText()); i++) {
                            bookArrayList.add(new Book(nameBook.getText(), author.getText(),
                                    (String) genre.getSelected(), descriptionString, coverBook));
                        }



                        stage.clear();
                        stage.addActor(mainMenuTable);
                        stage.addActor(tableListAllBook);
                        stage.addActor(numberAllBookTable);
                    stage.addActor(descriptionInfoTable);
                        stage.addActor(infoMenuTable);
                        allBookListUpdate();
                        infoMenuTip = 1;




                }
            }
        });

    }

    public void allBookOnHendDolgListUpdate(){

        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });


        allBookScrollPaneTable.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive=false;
            if ((bookArrayList.get(i).dataOfGiven!=null)&&(bookArrayList.get(i).dataOfGiven.getTimeInMillis()<=nowData.getTimeInMillis())) {
                bookExclusive = true;
            }

            for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name+ bookArrayList.get(i).author + bookArrayList.get(i).genre)){

                    bookExclusive = false;

                }


            }

            if (bookExclusive){
                newBookAdded = new TextButton( bookArrayList.get(i).author +"  "+ bookArrayList.get(i).name, skin);
                newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                newBookAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        for (int i = 0; i < bookArrayList.size(); i++) {
                            if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                index = i;
                            }
                        }
                    }
                });
                allBookScrollPaneTable.add(newBookAdded).pad(2).row();
            }}

    }

    public void allBookOnHendListUpdate() {
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });


        allBookScrollPaneTable.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive=false;
            if (bookArrayList.get(i).dataOfGiven!=null) {
                bookExclusive = true;
            }

            for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name+ bookArrayList.get(i).author + bookArrayList.get(i).genre)){

                    bookExclusive = false;

                }


            }

            if (bookExclusive){
                newBookAdded = new TextButton( bookArrayList.get(i).author +"  "+ bookArrayList.get(i).name, skinTree);
                newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                newBookAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        for (int i = 0; i < bookArrayList.size(); i++) {
                            if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                index = i;
                            }
                        }
                    }
                });
                allBookScrollPaneTable.add(newBookAdded).pad(2).row();
            }}
    }

    public void allBookOnMyHendListUpdate() {
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });


        allBookScrollPaneTable.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive=false;
                   if (bookArrayList.get(i).dataOfGiven==null) {
                        bookExclusive = true;

                }



            for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name+ bookArrayList.get(i).author + bookArrayList.get(i).genre)){

                        bookExclusive = false;

                }


            }

            if (bookExclusive){
                newBookAdded = new TextButton( bookArrayList.get(i).author +"  "+ bookArrayList.get(i).name, skinTree);
                newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

                newBookAdded.addListener(new ChangeListener() {
                    @Override
                    public void changed(ChangeEvent event, Actor actor) {
                        for (int i = 0; i < bookArrayList.size(); i++) {
                            if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                                index = i;
                            }
                        }
                    }
                });
                allBookScrollPaneTable.add(newBookAdded).pad(2).row();
            }}
    }

    public void allBookListUpdate() {
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(bookArrayList,new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });


        allBookScrollPaneTable.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            bookExclusive=true;
            for (int i1 = 0; i1 < allBookScrollPaneTable.getChildren().toArray().length; i1++) {
                if (allBookScrollPaneTable.getChildren().get(i1).getName().equals(bookArrayList.get(i).name+ bookArrayList.get(i).author + bookArrayList.get(i).genre)){
                    bookExclusive=false;
                }


            }


            if (bookExclusive){
            newBookAdded = new TextButton( bookArrayList.get(i).author +"  "+ bookArrayList.get(i).name, skinTree);
            newBookAdded.setName(bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre);

            newBookAdded.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    for (int i = 0; i < bookArrayList.size(); i++) {
                        if ((bookArrayList.get(i).name + bookArrayList.get(i).author + bookArrayList.get(i).genre).equals(actor.getName())) {
                            index = i;
                        }
                    }
                }
            });
            allBookScrollPaneTable.add(newBookAdded).pad(2).row();
        }}
    }


    public void allReaderListUpdate() {
        Collections.sort(readersArrayList,new Comparator<Readers>() {
            public int compare(Readers o1, Readers o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(readersArrayList,new Comparator<Readers>() {
            public int compare(Readers o1, Readers o2) {
                return o1.surname.compareTo(o2.surname);
            }
        });

        allReaderScrollPaneTable.clear();
        for (int i = 0; i < readersArrayList.size(); i++) {
            newReaderAdded = new TextButton(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern, skinTree);
            newReaderAdded.setName(readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern);
            newReaderAdded.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    for (int i = 0; i < readersArrayList.size(); i++) {
                        if ((readersArrayList.get(i).surname + " " + readersArrayList.get(i).name + " " + readersArrayList.get(i).yearsLern).equals(actor.getName())) {
                            index = i;
                        }
                    }
                }
            });
            allReaderScrollPaneTable.add(newReaderAdded).size(newReaderAdded.getWidth(), newReaderAdded.getHeight()).row();
        }
    }


    public void newReaderMenu() {
        newReaderTable.setFillParent(true);
        newReaderTable.setPosition(0, 0);


        nameReader = new TextField("", skinTree);
        nameReader.setMessageText("имя нового читателя");
        surnameReader = new TextField("", skinTree);
        surnameReader.setMessageText("фамилия нового читателя");
        patronymicReader = new TextField("", skinTree);
        patronymicReader.setMessageText("отчество нового читателя");
        classReader = new SelectBox(skinTree);
        classReader.setItems("1 класс", "2 класс", "3 класс", "4 класс", "5 класс", "6 класс", "7 класс", "8 класс", "9 класс", "10 класс", "11 класс");
        errorNewReader = new TextField("заполните обязательные поля", skinTree);
        errorNewReader.setDisabled(true);
        errorNewReader.setColor(Color.RED);
        addNewReader = new TextButton("добавить", skinTree);

        newReaderTable.add(surnameReader).size(350, 30).pad(2).row();
        newReaderTable.add(nameReader).size(350, 30).pad(2).row();
        newReaderTable.add(patronymicReader).size(350, 30).pad(2).row();
        newReaderTable.add(classReader).pad(2).row();
        newReaderTable.add(addNewReader).pad(2).row();
        addNewReader.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                if ((nameReader.getText().equals("")) || (surnameReader.getText().equals("")) || (patronymicReader.getText().equals(""))) {
                    newReaderTable.add(errorNewReader);

                } else {


                    readersArrayList.add(new Readers(nameReader.getText(), surnameReader.getText(), patronymicReader.getText(), classReader.getSelectedIndex() + 1));
                    newReaderTable.clear();
                    newReaderTable.add(surnameReader).size(350, 30).pad(2).row();
                    newReaderTable.add(nameReader).size(350, 30).pad(2).row();
                    newReaderTable.add(patronymicReader).size(350, 30).pad(2).row();
                    newReaderTable.add(classReader).pad(2).row();
                    newReaderTable.add(addNewReader).pad(2).row();
                    stage.clear();
                    stage.addActor(mainMenuTable);
                    stage.addActor(tableListAllBook);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(descriptionInfoTable);
                    stage.addActor(infoMenuTable);
                    allReaderListUpdate();
                    allBookListUpdate();
                    infoMenuTip = 1;


                }


            }
        });

    }

    public void giveBookMenu() {

        giveBookButtonTable.setFillParent(true);
        giveBookButtonTable.setPosition(0, -Gdx.graphics.getHeight() / 4);
        giveBookButton = new TextButton("выдать книгу", skinTree);
        giveBookButtonTable.add(giveBookButton);
        erorTextField=new TextField("",skinTree);
        erorTextField.setDisabled(true);
        giveBookButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                if ((bookOnGivMenuTable.getRows() == 3)&&(readersOnGivMenuTable.getRows() == 2)) {
                        for (Book book : bookArrayList) {

                            if ((book.author.equals(authorOfBookOnGivMenuSelectBox.getSelected()))&&
                                    (book.name.equals(nameOfBookOnGivMenuSelectBox.getSelected()))&&
                                    (book.genre.equals(genreOfBookOnGivMenuSelectBox.getSelected()))&&
                                    (book.dataOfGiven==null)){
                                for (Readers value : readersArrayList) {
                                    if ((value.surname + " " + value.name).equals(surnameOfReadersOnGivMenuSelectBox.getSelected())) {
                                        book.giveBook(value);
                                        break;
                                    }
                                }

bookOnHendNumberInt++;
                                stage.clear();
                                stage.addActor(mainMenuTable);
                                stage.addActor(numberAllBookTable);
                                stage.addActor(tableListAllBook);
infoMenuTip=1;

break;
                            }else {
                                stage.clear();
                                stage.addActor(mainMenuTable);
                                stage.addActor(numberAllBookTable);
                                stage.addActor(giveBookButtonTable);
                                stage.addActor(readersOnGivMenuTable);
                                stage.addActor(bookOnGivMenuTable);
                                erorTextField.setText("все книги на руках");
                                erorTextField.setColor(Color.RED);
                                erorTextField.setWidth(335);
                                erorTextField.setPosition(Gdx.graphics.getWidth()/2-erorTextField.getWidth()/2,20);
                                stage.addActor(erorTextField);
                            }
                        }


                    }else {
                    stage.clear();
                    stage.addActor(mainMenuTable);
                    stage.addActor(numberAllBookTable);
                    stage.addActor(giveBookButtonTable);
                    stage.addActor(readersOnGivMenuTable);
                    stage.addActor(bookOnGivMenuTable);
                    erorTextField.setText("выберите книгу и ученика");
                    erorTextField.setColor(Color.RED);
                    erorTextField.setWidth(335);
                    erorTextField.setPosition(Gdx.graphics.getWidth()/2-erorTextField.getWidth()/2,20);
                    stage.addActor(erorTextField);
                }

            }
        });
        bookOnGivMenuTable.setFillParent(true);
        bookOnGivMenuTable.setPosition(-Gdx.graphics.getWidth() / 4 - 10, 0);
        genreOfBookOnGivMenuSelectBox = new SelectBox(skinTree);
        authorOfBookOnGivMenuSelectBox = new SelectBox(skinTree);
        nameOfBookOnGivMenuSelectBox = new SelectBox(skinTree);
        genreOfBookOnGivMenuSelectBox.setItems("неопеделенный жанр", "учебники", "классика", "детская литература", "справочная литература", "зарубежная литература");
        bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox).pad(2).row();
        authorOfBookOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                getBookNameByAuthor((String) authorOfBookOnGivMenuSelectBox.getSelected(), genreOfBookOnGivMenuSelectBox.getSelected());
                nameOfBookOnGivMenuSelectBox.setItems(nameOfBookOnGivMenuArrayList.toArray());
                bookOnGivMenuTable.clear();
                bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox).pad(2).row();
                bookOnGivMenuTable.add(authorOfBookOnGivMenuSelectBox).pad(2).row();
                bookOnGivMenuTable.add(nameOfBookOnGivMenuSelectBox).pad(2).row();
            }
        });

        genreOfBookOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                getBookAuthorByGenre((String) genreOfBookOnGivMenuSelectBox.getSelected());
                authorOfBookOnGivMenuSelectBox.setItems(authorOfBookOnGivMenuArrayList.toArray());
                bookOnGivMenuTable.clear();
                bookOnGivMenuTable.add(genreOfBookOnGivMenuSelectBox).pad(2).row();
                bookOnGivMenuTable.add(authorOfBookOnGivMenuSelectBox).pad(2).row();

            }
        });


        readersOnGivMenuTable.setFillParent(true);
        readersOnGivMenuTable.setPosition(Gdx.graphics.getWidth() / 4 + 10, 0);
        classOfReadersOnGivMenuSelectBox = new SelectBox(skinTree);
        surnameOfReadersOnGivMenuSelectBox = new SelectBox(skinTree);
        classOfReadersOnGivMenuSelectBox.setItems("1 класс", "2 класс", "3 класс", "4 класс", "5 класс", "6 класс", "7 класс", "8 класс", "9 класс", "10 класс", "11 класс");

        readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
        classOfReadersOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                getReadersSurnameByClass(classOfReadersOnGivMenuSelectBox.getSelectedIndex() + 1);
                surnameOfReadersOnGivMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
                readersOnGivMenuTable.clear();
                readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();

            }
        });
        surnameOfReadersOnGivMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                readersOnGivMenuTable.clear();
                readersOnGivMenuTable.add(classOfReadersOnGivMenuSelectBox).pad(2).row();
                readersOnGivMenuTable.add(surnameOfReadersOnGivMenuSelectBox).pad(2).row();

            }
        });


    }

    private void getBookNameByAuthor(String author, Object genre) {
        nameOfBookOnGivMenuArrayList.clear();
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).genre.equals(genre)) {
                if (bookArrayList.get(i).author.equals(author)) {
                    haveBoolean =true;
                    for (int i1 = 0; i1 < nameOfBookOnGivMenuArrayList.size(); i1++) {
                        if ( nameOfBookOnGivMenuArrayList.get(i1).equals(bookArrayList.get(i).name)){
                            haveBoolean =false;
                        }

                    }
                    if (haveBoolean) {
                        nameOfBookOnGivMenuArrayList.add(bookArrayList.get(i).name);
                    }

                }
            }
        }
    }

    public void getReadersSurnameByClass(int yearsLern) {
        surnameOfReadersOnGivMenuArrayList.clear();
        for (int i = 0; i < readersArrayList.size(); i++) {
            if (readersArrayList.get(i).yearsLern == yearsLern) {
                nameAdded = false;
                for (int i1 = 0; i1 < surnameOfReadersOnGivMenuArrayList.size(); i1++) {

                    if (
                            surnameOfReadersOnGivMenuArrayList.get(i1).equals(readersArrayList.get(i).surname)) {
                        nameAdded = true;
                    }
                }
                if (!nameAdded) {
                    surnameOfReadersOnGivMenuArrayList.add(readersArrayList.get(i).surname+" "+readersArrayList.get(i).name);
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
        bookOnReturnMenuSelectBox=  new SelectBox(skinTree);
        returnBookButton=new TextButton("вернуть книгу",skinTree);
        classOfReadersOnReturnMenuSelectBox.setItems("1 класс", "2 класс", "3 класс", "4 класс", "5 класс", "6 класс", "7 класс", "8 класс", "9 класс", "10 класс", "11 класс");

        returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
        classOfReadersOnReturnMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                getReadersSurnameByClass(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1);
                surnameOfReadersOnReturnMenuSelectBox.setItems(surnameOfReadersOnGivMenuArrayList.toArray());
                returnMenuTable.clear();
                returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();

            }
        });
        surnameOfReadersOnReturnMenuSelectBox.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {

                getBookByName(classOfReadersOnReturnMenuSelectBox.getSelectedIndex() + 1, (String) surnameOfReadersOnReturnMenuSelectBox.getSelected());
                bookOnReturnMenuSelectBox.setItems(bookReturnArrayList.toArray());
                returnMenuTable.clear();
                returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
                returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
                returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).row();

            }
        });
bookOnReturnMenuSelectBox.addListener(new ChangeListener() {
    @Override
    public void changed(ChangeEvent event, Actor actor) {
        returnMenuTable.clear();
        returnMenuTable.add(classOfReadersOnReturnMenuSelectBox).pad(2).row();
        returnMenuTable.add(surnameOfReadersOnReturnMenuSelectBox).pad(2).row();
        returnMenuTable.add(bookOnReturnMenuSelectBox).pad(2).row();
        returnMenuTable.add(returnBookButton).pad(2).row();
    }





});
returnBookButton.addListener(new ChangeListener() {
    @Override
    public void changed(ChangeEvent event, Actor actor) {
        for (Readers reader : readersArrayList) {
            if (((reader.surname + " " + reader.name).equals(surnameOfReadersOnReturnMenuSelectBox.getSelected()))&&
                    (reader.yearsLern==classOfReadersOnReturnMenuSelectBox.getSelectedIndex()+1)){
                for (Book book : bookArrayList) {

                    if ((((book.author + " " + book.name).equals(bookOnReturnMenuSelectBox.getSelected())))&&(book.giveThisReader(reader))) {
                        stage.clear();
                        stage.addActor(mainMenuTable);
                        stage.addActor(tableListAllBook);
                        stage.addActor(numberAllBookTable);
                        stage.addActor(descriptionInfoTable);
                        stage.addActor(infoMenuTable);
                        infoMenuTip = 1;
                        allBookListUpdate();
                       book.returnBook();
                        break;
                    }

                }


                break;
            }

        }
    }
});


    }

   public   void getBookByName(int age, String selected) {
         bookReturnArrayList.clear();
         for (Readers reader : readersArrayList) {
             if (((reader.surname + " " + reader.name).equals(selected))&&(reader.yearsLern==age)){
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