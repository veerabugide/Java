package com.JPA.Demo1.Service;

import com.JPA.Demo1.Books;

import java.util.ArrayList;
import java.util.List;


public class MyServices implements MyServicesInterface{

    List<Books> list=new ArrayList<Books>();


    public MyServices(){
        list.add(new Books(1,"java","about java"));
        list.add(new Books(2,"python","about python"));
    }

    @Override
    public List<Books> getBooks() {  //get all books from the library
        return list;
    }

    @Override
    public Books addBook(Books books) {
       this.list.add(books);
        return books;
    }

    @Override
    public Books getById(int id) {

        for(Books books:this.list){
            if(books.getId()==id){
                return books;
            }
        }
        return null;

    }
}
