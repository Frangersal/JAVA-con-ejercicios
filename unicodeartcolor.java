public class unicodeartcolor {
    public static void main(String[] args) {

        String RESET = "\u001B[0m";
        String GREEN = "\u001B[38;2;7;68;41m"; // #074429
        String BLACK = "\u001B[38;2;0;0;0m"; // negro
        String WHITE = "\u001B[48;2;227;229;216m"; // #e3e5d8

        System.out.print(
                GREEN + "██████████████████████████████████████████████\n" +
                        "██" + WHITE + BLACK + "                                          " + RESET + GREEN + "██\n" +
                        "██" + WHITE + BLACK + "  ████████  ████████  ████████  ███  ███  " + RESET + GREEN + "██\n" +
                        "██" + WHITE + BLACK + "  ██        ██        ██        ████████  " + RESET + GREEN + "██\n" +
                        "██" + WHITE + BLACK + "  ██████    ██  ████  ████████  ██ ██ ██  " + RESET + GREEN + "██\n" +
                        "██" + WHITE + BLACK + "  ██        ██    ██        ██  ██ ██ ██  " + RESET + GREEN + "██\n" +
                        "██" + WHITE + BLACK + "  ██        ████████  ████████  ██    ██  " + RESET + GREEN + "██\n" +
                        "██" + WHITE + BLACK + "                                          " + RESET + GREEN + "██\n" +
                        "██████████████████████████████████████████████" +
                        RESET);
    }
}
