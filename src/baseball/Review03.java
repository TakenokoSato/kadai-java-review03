package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        yakult.report();

        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        baystars.report();

        BaseBallTeam tigers = new  BaseBallTeam("阪神タイガース",68,71,4);
        tigers.report();

        BaseBallTeam giants = new BaseBallTeam();
        giants.setName("読売ジャイアンツ");
        giants.setWin(68);
        giants.setLose(72);
        giants.setDraw(3);
        giants.report();

        BaseBallTeam carp = new BaseBallTeam();
        carp.setName("広島東洋カープ");
        carp.setWin(66);
        carp.setLose(74);
        carp.setDraw(3);
        carp.report();

        BaseBallTeam dragons = new BaseBallTeam();
        dragons.setName("中日ドラゴンズ");
        dragons.setWin(66);
        dragons.setLose(75);
        dragons.setDraw(2);
        dragons.report();
    }

}