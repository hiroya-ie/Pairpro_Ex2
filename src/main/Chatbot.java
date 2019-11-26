public class Chatbot {
    private String name;

    //コンストラクタ生成部
    public Chatbot() {
        System.out.println("チャットボットの原型を作成します。");

    }
    public Chatbot(String str) {
        this.name = str;
        System.out.println("チャットボット名" + name + "を作成します。");
    }

    public void greeting(){
        System.out.println("はじめまして" + name + "です，よろしくおねがいします");
    }

    public void setName(String name){
        if (name.equals("差別用語")){
            System.out.println("禁止されています");
        } else {
            String old = this.name;
            System.out.println("ボット名を" + old + "から" + name + "へと変更します");
            this.name = name;
        }
    }
}
