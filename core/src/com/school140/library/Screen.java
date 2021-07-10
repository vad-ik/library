package com.school140.library;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.util.ArrayList;
import java.util.Arrays;

public class Screen {
    static Texture errorStar=new Texture(Gdx.files.internal("error.jpg"));
static     ArrayList<Integer> errorCord=new ArrayList<>();
    static Stage stage;

    PagedScrollPane allBookList;
    Table table = new Table();
    Table tableListAllBook = new Table();
    Table newBookTable = new Table();
    Table addNewBookTable = new Table();
    Table newReaderTable = new Table();
    Table giveMenuTable = new Table();
    Table returnMenuTable = new Table();
Table descriptionTable =new Table();

    TextButton newBook;
    TextButton newReader;
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

        stage.addActor(table);

    }

    private void allBookMenu() {
        allBookList = new PagedScrollPane();
        tableListAllBook.setFillParent(true);
        tableListAllBook.setPosition(Gdx.graphics.getHeight()/-3, 0);
        tableListAllBook.add(allBookList);


       stage.addActor(tableListAllBook);

    }



    public static void render() {

        stage.act();

        stage.draw();
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
        table.setFillParent(true);
        newBook = new TextButton("добавить книгу", skin);
        table.setPosition(0, Gdx.graphics.getHeight() / 2 - newBook.getHeight() - 8);


        newReader = new TextButton("добавить читателя", skin);
        giveBook = new TextButton("выдать книгу", skin);
        returnBook = new TextButton("вернуть книгу", skin);
sort=new SelectBox(skin);
        dolg = new TextButton("должники", skin);
        allBook = new TextButton("все книги", skin);
        myBook = new TextButton("книги в наличии", skin);
        readers = new TextButton("все читатели", skin);
        onHands = new TextButton("книги на руках", skin);


        table.add(newBook).fillX().pad(0, 2, 0, 0);
        table.add(newReader).fillX().pad(0, 2, 0, 0);
        table.add(giveBook).fillX().pad(0, 2, 0, 0);
        table.add(returnBook).fillX().pad(0, 2, 0, 0);
        table.row().pad(10, 0, 10, 0);
        table.add(allBook).fillX().pad(2, 2, 0, 0);
        table.add(myBook).fillX().pad(2, 2, 0, 0);
        table.add(readers).fillX().pad(2, 2, 0, 0);
        table.add(onHands).fillX().pad(2, 2, 0, 0);
        table.add(dolg).fillX().pad(2, 2, 0, 0);

        newBook.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                stage.clear();
                stage.addActor(table);
                stage.addActor(newBookTable);
                stage.addActor(addNewBookTable);
                stage.addActor(descriptionTable);

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
          stage.addActor(table);
          stage.addActor(tableListAllBook);
          allBookListUpdate();

            }
            }
        });

    }

   public void allBookListUpdate() {
        Array newItems = new Array<String>();
        for (int i = 0; i < bookArrayList.size(); i++) {
            newItems.add(bookArrayList.get(i).name);
        }
      //  allBookList.setItems(newItems);

//
tableListAllBook.setPosition((float) (-0.5*Gdx.graphics.getWidth()+3*allBookList.getWidth()/2),(float)
        (+0.5*Gdx.graphics.getHeight()-allBookList.getHeight()/2-2*newBook.getHeight()-20));



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