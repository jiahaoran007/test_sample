package compile.java;

public class test {
    public static void main(String[] args) {
        TalkFactory factory = new TalkFactory();
        System.out.println("正在创建会话");
        Talk talk = (Talk) factory.CreateTalk(Talk.class);
        talk.PersonTalk();
        talk.GroupTalk();
        System.out.println("\n");

        option Option = new option();
        Option.MessageOperate(new StrategyB());
        System.out.println("\n");

        session sage = new Talk();
        session history_1 = new history(sage);
        history_1.function();

    }
}
