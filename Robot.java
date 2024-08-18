public class Robot {

    String name;
    String yearManufactured;
    String catalogueNumber;
    private boolean sentient;
    String batteryLife;
    private int weaponsNumber;
    private String material;
    String[] utensils;

    public Robot(String name, String yearManufactured, String catalogueNumber, boolean sentient, String batteryLife,
            int weaponsNumber, String material) {
        this.name = name;
        this.yearManufactured = yearManufactured;
        this.catalogueNumber = catalogueNumber;
        this.sentient = sentient;
        this.batteryLife = batteryLife;
        this.weaponsNumber = weaponsNumber;
        this.material = material;

    }

    public Robot(Robot copyOfRobot) {
        this.name = copyOfRobot.name;
        this.yearManufactured = copyOfRobot.yearManufactured;
        this.catalogueNumber = copyOfRobot.catalogueNumber;
        this.sentient = copyOfRobot.sentient;
        this.batteryLife = copyOfRobot.batteryLife;
        this.weaponsNumber = copyOfRobot.weaponsNumber;
        this.material = copyOfRobot.material;
        this.utensils = utensils;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getYear() {
        return yearManufactured;
    }

    public void setYear(String year) {
        this.yearManufactured = year;

    }

    public String getCatNum() {
        return catalogueNumber;
    }

    public void setCatNum(String catNumber) {
        this.catalogueNumber = catNumber;

    }

    public boolean getSentient() {
        int number = (int) (Math.random() * 2);
        return number == 1;

    }

    public String getBattery() {
        return batteryLife;
    }

    public void setBattery(String battery) {
        this.batteryLife = battery;

    }

    public int getWeapons() {
        return weaponsNumber;
    }

    public void setWeapons(int weapons) {
        this.weaponsNumber = weapons;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;

    }

    public String[] getUtensils() {
        return this.utensils;
    }

    public void setUtensils(String[] utensils) {
        this.utensils = utensils;

    }

    public static String getJitters() {
        return "                                 _______" +
                "                                 |     |\n" +
                "                                 | | | |\n" +
                "                                 |_____|\n" +
                "                           ____ ___|_|___ ____\n" +
                "                          ()___)         ()___)\n" +
                "                          // /|           |\\ \\\\\n" +
                "                         // / |           | \\ \\\\\n" +
                "                        (___) |___________| (___)\n" +
                "                        (___)   (_______)   (___)\n" +
                "                        (___)     (___)     (___)\n" +
                "                        (___)      |_|      (___)\n" +
                "                        (___)  ___/___\\___   | |\n" +
                "                         | |  |           |  | |\n" +
                "                         | |  |___________| /___\\\n" +
                "                        /___\\  |||     ||| //   \\\\\n" +
                "                       //   \\\\ |||     ||| \\\\   //\n" +
                "                       \\\\   // |||     |||  \\\\ //\n" +
                "                        \\\\ // ()__)   (__()    \n" +
                "                              ///       \\\\\n" +
                "                             ///         \\\\\n" +
                "                           _///___     ___\\\\\\_\n" +
                "                          |_______|   |_______|\n";
    };

    public static String getAid() {
        return

        "                             .-\"\"\"-.\n" +
                "                            /`       `\\\n" +
                "     ,-==-.                ;           ;\n" +
                "    /(    \\`.              |           |\n" +
                "   | \\ ,-. \\ (             :           ;\n" +
                "    \\ \\`-.> ) 1             \\         /\n" +
                "     \\_`.   | |              `._   _.`\n" +
                "      \\o_`-_|/                _|`\"'|-.\n" +
                "     /`  `>.  __          .-'`-|___|_ )\n" +
                "    |\\  (^  >'  `>-----._/             )\n" +
                "    | `._\\ /    /      / |      ---   -;\n" +
                "    :     `|   (      (  |      ___  _/    ,\n" +
                "     \\     `.  `\\      \\_\\      ___ _/     \n" +
                "      `.     `-='`t----'  `--.______/\n" +
                "        `.   ,-''-.)           |---|\n" +
                "          `.(,-=-./             \\_/\n" +
                "             |   |               V\n" +
                "             |-''`-.             `.\n" +
                "           /  ,-'-\\.              `-.\n" +
                "           |  (      \\                `.\n" +
                "            \\  \\     |               ,.'\n";
    }

}