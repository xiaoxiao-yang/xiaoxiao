package com.spdb.DI;

/**
 * @Author Yang Qi
 * @Date 2020/8/13 16:59
 */
public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TextEditor(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
        System.out.println("此次使用依赖注入");
    }

    public TextEditor(){
        System.out.println("无参构造函数。");
    }
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
        System.out.println("---------");
    }


}
