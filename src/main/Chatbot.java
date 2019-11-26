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
        this.name = name;
    }
}
