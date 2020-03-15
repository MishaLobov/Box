/*
* Михаил Лобов
* Ну как бы вот собственно и сам джинерик
 */
package com.company;

public class box <T> {
    private T ob; // обект типа Т

    // пердача кнструктору ссылки на объект типа Т
    box(T o){
        ob = o;
    }
    // добавить обьект
    T getAdd(){
        return  ob;
    }
     // забрать объект
    void getTake(){
        System.out.println("Bы забрали объект");
    }
    // удалить объект
    T getDel(){
        return ob;
    }


}
