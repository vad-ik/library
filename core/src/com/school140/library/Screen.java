package com.school140.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.util.ArrayList;

public class Screen {
    static Texture errorStar=new Texture(Gdx.files.internal("error.jpg"));
static     ArrayList<Integer> errorCord=new ArrayList<>();
    static Stage stage;
ScrollPane allBookScrollPane;
    List allBookList;
    static int index = -1;
    Table mainMenuTable = new Table();
    static Table numberAllBookTable = new Table();
    static TextField numberAllBook;
    static Table infoMenuTable = new Table();
    Table allBookScrollPaneTable = new Table();
    Table tableListAllBook = new Table();
    Table newBookTable = new Table();
    Table addNewBookTable = new Table();
    Table newReaderTable = new Table();
    Table giveMenuTable = new Table();
    Table returnMenuTable = new Table();
Table descriptionTable =new Table();
    TextButton newBookAdded;
    TextButton newBook;
    TextButton newReader;
    boolean noNullPointerException = true;
    SelectBox sort;
boolean noError=true;
    TextButton giveBook;
    TextButton returnBook;
    TextButton dolg;
    TextButton allBook;
    TextButton myBook;
    TextButton onHands;
    TextButton readers;
static Label error;
    static TextField nameBook;
    static int infoMenuTip=1;
    //1=book info
    static TextField authorWindow;
    static TextField nameBookWindow;
    static TextField numberWindow;
    static TextField ISBNWindow;
    static Texture imageWindow;
    static TextField genreWindow;
    static TextField descriptionWindow;


    static Window authorWindowPreName;
    static Window nameBookWindowPreName;
    static Window numberWindowPreName;
    static Window genreWindowPreName;
    static Window descriptionWindowPreName;

    TextField author;
    TextField number;
    TextField ISBN;
    TextField pathToImage;
    SelectBox genre;
     TextField description;
TextButton bookAdded;
    Skin skin;
    Texture coverBook;
    static ArrayList<Book> bookArrayList = new ArrayList<>();

    public Screen() {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);


        skin = new Skin(Gdx.files.internal("default/skin/uiskin.json"));


        meinMenu();
        allBookMenu();
        newBookMenu();
        newReaderMenu();
        giveBookMenu();
        returnBookMenu();
        infoMenu();

        stage.addActor(mainMenuTable);

    }

    public static void imgRender(SpriteBatch batch) {

        if(infoMenuTip==1){

                batch.draw(imageWindow,Gdx.graphics.getWidth()/5*3,Gdx.graphics.getHeight()/2,
                        (Gdx.graphics.getHeight()/2.0f-100.0f)/imageWindow.getHeight()*imageWindow.getWidth(),Gdx.graphics.getHeight()/2-100.0f);

            }

    }

    private void infoMenu() {

        authorWindowPreName=new Window("автор",skin);
        numberWindowPreName=new Window("количество",skin);
        genreWindowPreName=new Window("жанр",skin);
        descriptionWindowPreName=new Window("оптисание",skin);
        nameBookWindowPreName=new Window("название",skin);


        infoMenuTable.setPosition(Gdx.graphics.getWidth()/4*3,Gdx.graphics.getHeight()/3);



        authorWindow=new TextField("автор",skin);
        authorWindow.setDisabled(true);
        numberWindow=new TextField("0",skin);
        numberWindow.setDisabled(true);
                ISBNWindow=new TextField("ISBN",skin);
        imageWindow =new Texture(Gdx.files.internal("noimg.png"));
                genreWindow=new TextField("жанр",skin);
                genreWindow.setDisabled(true);
        descriptionWindow=new TextField("оптисание",skin);
        descriptionWindow.setDisabled(true);
        nameBookWindow=new TextField("название",skin);
        nameBookWindow.setDisabled(true);
        infoMenuTable.add(nameBookWindowPreName).fill(22,1).pad(2,0,2,75);
        infoMenuTable.add(nameBookWindow).row();
        infoMenuTable.add(authorWindowPreName).fill(22,1).pad(2,0,2,75);
        infoMenuTable.add(authorWindow).row();
        infoMenuTable.add(genreWindowPreName).fill(22,1).pad(2,0,2,75);
        infoMenuTable.add(genreWindow).row();
        infoMenuTable.add(numberWindowPreName).fill(22,1).pad(2,0,2,75);
        infoMenuTable.add(numberWindow).row();
        infoMenuTable.add(descriptionWindowPreName).fill(22,1).pad(2,0,2,75);
        infoMenuTable.add(descriptionWindow).fill(true,true);

stage.addActor(infoMenuTable);

    }

    private void allBookMenu() {
        allBookList = new List(skin);
        allBookScrollPaneTable.row();
        allBookScrollPane = new ScrollPane(allBookScrollPaneTable);

        allBookScrollPane.setScrollingDisabled(true,true);

      noNullPointerException=true;
      try {
          tableListAllBook.add(allBookScrollPane)
                  .size(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()-2*bookAdded.getHeight()-70);


          tableListAllBook.setPosition(Gdx.graphics.getWidth()/4+10,Gdx.graphics.getHeight()/2);
      }catch (NullPointerException e ){
          noNullPointerException=false;
      }
        if (noNullPointerException){
            tableListAllBook.add(allBookScrollPane)
                    .size(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()-2*bookAdded.getHeight()-70);
            tableListAllBook.setPosition(Gdx.graphics.getWidth()/4+10,Gdx.graphics.getHeight()/2-30);
        }




       stage.addActor(tableListAllBook);

    }



    public static void render() {
        numberAllBook.setText(String.valueOf(Book.number));
        numberAllBookTable.setPosition(numberAllBook.getWidth()-60
                ,numberAllBook.getHeight()+2);
renderInfoMenu();

        stage.act();

        stage.draw();
    }

    private static void renderInfoMenu() {
        if(infoMenuTip==1){
            if(index==-1){

            }else{
                if (!bookArrayList.get(index).name.equals(nameBookWindow.getText())){

                    authorWindow.setText(bookArrayList.get(index).author);
                    numberWindow.setText(String.valueOf(bookArrayList.get(index).numberMein));
                  //  ISBNWindow.setText(bookArrayList.get(index).);
                    imageWindow =bookArrayList.get(index).coverBook;
                    genreWindow.setText(bookArrayList.get(index).genre);
                    descriptionWindow.setText(bookArrayList.get(index).description);
                    nameBookWindow.setText(bookArrayList.get(index).name);


                }


            }








        }


    }

    public static void errorRender(Batch batch) {
        if (errorCord.size()>0){
            for (int i = 0; i < errorCord.size(); i+=2) {
                batch.draw(errorStar,errorCord.get(i),errorCord.get(i+1),30,30);
            }
batch.draw(errorStar,(Gdx.graphics.getWidth()-error.getWidth())/3+20,((Gdx.graphics.getHeight()-10*nameBook.getHeight())/2-36),30,30);

        }
    }


    public void meinMenu() {
        mainMenuTable.setFillParent(true);
        newBook = new TextButton("добавить книгу", skin);
        mainMenuTable.setPosition(0, Gdx.graphics.getHeight() / 2 - newBook.getHeight() - 8);

        numberAllBook = new TextField("0",skin);
      numberAllBookTable.setPosition(numberAllBook.getWidth()+10
     ,numberAllBook.getHeight()+10);

numberAllBookTable.debug();

        newReader = new TextButton("добавить читателя", skin);
        giveBook = new TextButton("выдать книгу", skin);
        returnBook = new TextButton("вернуть книгу", skin);
sort=new SelectBox(skin);
        dolg = new TextButton("должники", skin);
        allBook = new TextButton("все книги", skin);
        myBook = new TextButton("книги в наличии", skin);
        readers = new TextButton("все читатели", skin);
        onHands = new TextButton("книги на руках", skin);
numberAllBookTable.add(numberAllBook);
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

allBook.addListener(new ChangeListener() {
    @Override
    public void changed(ChangeEvent event, Actor actor) {
        stage.clear();
        stage.addActor(mainMenuTable);
        stage.addActor(tableListAllBook);
        stage.addActor(numberAllBookTable);
        stage.addActor(infoMenuTable);

        infoMenuTip=1;
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
                infoMenuTip=-1;

                nameBook.setText(null);
                ISBN.setText(null);
                author.setText(null);
                pathToImage.setText(null);
                number.setText(null);
description.setText(null);
genre.setSelected(1);
                addNewBookTable.clear();
                addNewBookTable.add(number).pad(0,0,0,50);
                addNewBookTable.add(bookAdded).fill().pad(0,0,0,0);
                errorCord.clear();
            }
        });

    }

    public void newBookMenu() {
        newBookTable.setFillParent(true);
        newBookTable.setPosition(0, 0);
        addNewBookTable.setFillParent(true);
        nameBook = new TextField(null, skin);
        nameBook.setMessageText("название");
        addNewBookTable.setPosition(0, -5*nameBook.getHeight());
        descriptionTable.setFillParent(true);
        descriptionTable.setPosition(0,-3*nameBook.getHeight());
genre = new SelectBox(skin);
genre.setItems("неопеделенный жанр","учебники","классика","детская литература","справочная литература","зарубежная литература");
bookAdded = new TextButton("добавить",skin);
        author= new TextField(null, skin);
        number= new TextField(null, skin);
        ISBN= new TextArea(null, skin);
        ISBN.setMessageText("или ISBN(не доделанно)");
        description= new TextField(null, skin);
        author.setMessageText("автор");
        pathToImage= new TextField(null, skin);
        pathToImage.setMessageText("путь до обложки");
        number.setMessageText("количество");

        description.setMessageText("описание");

        newBookTable.add(nameBook).fillX().pad(0 ,0, 10, 0);
        newBookTable.add(ISBN).fill(2,1).pad(0 ,90, 10, 0).row();
        newBookTable.add(author).fillX().pad(0 ,0, 10, 0).row();
        newBookTable.add(genre).fillX().pad(0 ,0, 10, 0).row();
        newBookTable.add(pathToImage).fill(1.5f,1).pad(0 ,0, 10, 0).row();
        descriptionTable.add(description).fill(6,1).row();
        addNewBookTable.add(number).pad(0,0,0,50);
        addNewBookTable.add(bookAdded).fill().pad(0,0,0,0);
        newBookTable.row().pad(10, 0, 10, 0);


        nameBook.setColor(1,1,1,1);
        author.setColor(1,1,1,1);
        number.setColor(1,1,1,1);
        description.setColor(1,1,1,1);
        ISBN.setColor(1,1,1,1);
        genre.setColor(1,1,1,1);
        pathToImage.setColor(1,1,1,1);
        bookAdded.setColor(1,1,1,1);



        bookAdded.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent changeEvent, Actor actor) {
errorCord.clear();

                nameBook.setColor(1,1,1,1);
                author.setColor(1,1,1,1);
                number.setColor(1,1,1,1);

                noError=true;

                addNewBookTable.clear();
              try {
                  Integer.parseInt(number.getText());
              }catch (NumberFormatException e){
                  number.setText(null);

                  noError=false;

                 error=new Label("количество должно быть числом",skin);
                  addNewBookTable.add(number).pad(0,0,0,50);
                  addNewBookTable.add(bookAdded).fill().pad(0,0,0,0).row();
                  addNewBookTable.add(error).fill().pad(0,4,0,0);
                  errorCord.add((int)((Gdx.graphics.getWidth()-bookAdded.getWidth()-number.getWidth())/2-60));
                  errorCord.add((int)((Gdx.graphics.getHeight()-8*nameBook.getHeight())/2-34));
              }

             if(!pathToImage.getText().equals(""))   {
              try {
                  coverBook=new Texture(Gdx.files.absolute(pathToImage.getText()));
              }catch (GdxRuntimeException e){
                  pathToImage.setText(null);

                  noError=false;
                  error=new Label("неправильный путь",skin);
                  addNewBookTable.add(number).pad(0,0,0,50);
                  addNewBookTable.add(bookAdded).fill().pad(0,0,0,0).row();
                  addNewBookTable.add(error).fill().pad(0,4,0,0);
                  errorCord.add((int)((Gdx.graphics.getWidth()-pathToImage.getWidth()-ISBN.getWidth())/2));
                  errorCord.add((int)((Gdx.graphics.getHeight())/2-2.5*nameBook.getHeight()+8));
              }

             }else {
                 coverBook=new Texture(Gdx.files.internal("noimg.png"));
             }

if ((nameBook.getText().equals(""))||(author.getText().equals(""))||(number.getText().equals(""))){
    if(nameBook.getText().equals("")){
        errorCord.add((int)((Gdx.graphics.getWidth()-nameBook.getWidth()-ISBN.getWidth())/2));
        errorCord.add((int)((Gdx.graphics.getHeight())/2+1.5*nameBook.getHeight()+5));
    }
    if(author.getText().equals("")){
        errorCord.add((int)((Gdx.graphics.getWidth()-nameBook.getWidth()-ISBN.getWidth())/2));
        errorCord.add((int)((Gdx.graphics.getHeight())/2+10));
    }

error.clear();
    addNewBookTable.clear();
    noError=false;
    error=new Label(" заполните обязательные поля",skin);
    addNewBookTable.add(number).pad(0,0,0,0);
    addNewBookTable.add(bookAdded).fill().pad(0,0,0,0).row();
    addNewBookTable.add(error).fill().pad(0,4,0,0);
}

if(noError){
    addNewBookTable.clear();
    addNewBookTable.add(number).pad(0,0,0,50);
    addNewBookTable.add(bookAdded).fill().pad(0,0,0,0);
    if(!pathToImage.getText().equals(""))   {
        coverBook=new Texture(Gdx.files.absolute(pathToImage.getText()));}
              bookArrayList.add(new Book(nameBook.getText(),author.getText(),  Integer.parseInt(number.getText()),
                      (String) genre.getSelected(),description.getText(),coverBook));
          stage.clear();
          stage.addActor(mainMenuTable);
    stage.addActor(tableListAllBook);
    stage.addActor(numberAllBookTable);
    stage.addActor(infoMenuTable);
          allBookListUpdate();
    infoMenuTip=1;




            }
            }
        });

    }

   public void allBookListUpdate() {

       newBookAdded = new TextButton(nameBook.getText(),skin);
newBookAdded.setName(nameBook.getText());
newBookAdded.addListener(new ChangeListener() {
    @Override
    public void changed(ChangeEvent event, Actor actor) {
        for (int i = 0; i < bookArrayList.size(); i++) {
          if(bookArrayList.get(i).name.equals(actor.getName())){
              index=i;
          }
        }
    }
});
       allBookScrollPaneTable.add(newBookAdded).row();
    }


    public void newReaderMenu() {
        newReaderTable.setFillParent(true);
        newReaderTable.setPosition(0, 0);


        newReaderTable.row().pad(10, 0, 10, 0);
    }

    public void giveBookMenu() {
        giveMenuTable.setFillParent(true);
        giveMenuTable.setPosition(0, 0);


        giveMenuTable.row().pad(10, 0, 10, 0);
    }

    public void returnBookMenu() {
        returnMenuTable.setFillParent(true);
        returnMenuTable.setPosition(0, 0);


        returnMenuTable.row().pad(10, 0, 10, 0);
    }


}