package com.duckrace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DuckRacer implements Serializable {
    private final int id;
    private final List<Reward> rewards = new ArrayList<>();
    private String name;

    // constructors
    public DuckRacer(int id, String name) {
        this.id = id;
        setName(name);
    }

    // business or "action" methods
    public void win(Reward reward) {
        rewards.add(reward);
    }

    // accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // this is a derived property
    public int getWins() {
        return rewards.size();
    }

    /*
     * NOTE: currently, we are returning a direct reference to our internal List<Reward>.
     * That is not appropriate in this case.
     *
     * NOTE: instead of returning a direct reference to our internal List<Reward>
     */
    public List<Reward> getRewards() {
//        return rewards;
        return Collections.unmodifiableList(rewards);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
                "id=" + getId() +
                ", name='" + getName() +
                ", wins=" + getWins() +
                ", rewards=" + getRewards();
    }
}
