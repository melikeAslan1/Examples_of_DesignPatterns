/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public abstract class Observable {

    private List< Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void ekle(Observer observer) {

        observerList.add(observer);
    }

    public void cikar(Observer observer) {

        observerList.remove(observer);
    }

    public void haberVer() {

        for (Observer observer : observerList) {
             observer.update(this);
        }
    }
}
