package com.rnmfantasyapp.a2020fantasyfootallsimulator;

import java.io.Serializable;
import java.util.ArrayList;

//define team and different position on the team composed of players
public class Team implements Serializable {
    private String name = null;
    private Player qb = null;
    private Player rb1 = null;
    private Player rb2 = null;
    private Player wr1 = null;
    private Player wr2 = null;
    private Player wr3 = null;
    private Player te = null;
    private Player dst = null;
    private Player k = null;
    private Player bn1 = null;
    private Player bn2 = null;
    private Player bn3 = null;
    private Player bn4 = null;
    private ArrayList<Integer> picks = new ArrayList<Integer>();

    Team(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public Player getQb() {
        return qb;
    }

    public Player getRb1() {
        return rb1;
    }

    public Player getRb2() {
        return rb2;
    }

    public Player getWr1() {
        return wr1;
    }

    public Player getWr2() {
        return wr2;
    }

    public Player getWr3() {
        return wr3;
    }

    public Player getTe() {
        return te;
    }

    public Player getDst() {
        return dst;
    }

    public Player getK() {
        return k;
    }

    public Player getBn1() {
        return bn1;
    }

    public Player getBn2() {
        return bn2;
    }

    public Player getBn3() {
        return bn3;
    }

    public Player getBn4() {
        return bn4;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQb(Player qb) {
        this.qb = qb;
    }

    public void setRb1(Player rb1) {
        this.rb1 = rb1;
    }

    public void setRb2(Player rb2) {
        this.rb2 = rb2;
    }

    public void setWr1(Player wr1) {
        this.wr1 = wr1;
    }

    public void setWr2(Player wr2) {
        this.wr2 = wr2;
    }

    public void setWr3(Player wr3) {
        this.wr3 = wr3;
    }

    public void setTe(Player te) {
        this.te = te;
    }

    public void setDst(Player dst) {
        this.dst = dst;
    }

    public void setK(Player k) {
        this.k = k;
    }

    public void setBn1(Player bn1) {
        this.bn1 = bn1;
    }

    public void setBn2(Player bn2) {
        this.bn2 = bn2;
    }

    public void setBn3(Player bn3) {
        this.bn3 = bn3;
    }

    public void setBn4(Player bn4) {
        this.bn4 = bn4;
    }

    public ArrayList<Integer> getPicks() {
        return picks;
    }

    public void setPicks(ArrayList<Integer> picks) {
        this.picks = picks;
    }
}
