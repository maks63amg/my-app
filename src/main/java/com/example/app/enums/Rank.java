package com.example.app.enums;

public enum Rank {
    SOLDIER("солдат"),
    Senior_SOLDIER("старший солдат"),
    CORPORAL("молодший сержант"),
    SERGEANT("сержант"),
    SENIOR_SERGEANT("старший сержант"),
    MASTER_SERGEANT("старшина"),
    WARRANT_OFFICER("прапорщик"),
    SENIOR_WARRANT_OFFICER("старший прапорщик"),
    JUNIOR_LIEUTENANT("молодший лейтенант"),
    LIEUTENANT("лейтенант"),
    SENIOR_LIEUTENANT("молодший лейтенант"),
    CAPTAIN("капітан"),
    MAJOR("майор"),
    LIEUTENANT_COLONEL("підполковник"),
    COLONEL("полковник"),
    MAJOR_GENERAL("генерал майор"),
    LIEUTENANT_GENERAL("генерал лейтенант"),
    COLONEL_GENERAL("генерал полковник");

    private String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }
}
