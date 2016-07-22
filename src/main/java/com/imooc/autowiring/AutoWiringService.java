package com.imooc.autowiring;

/**
 * http://melonydi.cn
 *
 * @author melonydi
 * @create 2016-07-21 21:04
 */
public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    /*public AutoWiringService(AutoWiringDAO autoWiringDAO1){
        this.autoWiringDAO=autoWiringDAO1;
    }*/

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }
    public void say(String word){
        this.autoWiringDAO.say(word);
    }
}
