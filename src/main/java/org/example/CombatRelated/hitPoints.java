package org.example.CombatRelated;

import org.example.InventoryRelated.Potion;

public class hitPoints {

    private int Hp;

    private int MaxHp;

    private Boolean isDead;



    public int getHp() {
        return Hp;
    }

    public int getMaxHp() {
        return MaxHp;
    }

    public void Heal(Potion potion){
        this.Hp+=potion.getStrength();
    }

    public hitPoints(){
        this.Hp=25;
        this.MaxHp =25;
    }

    public void TakeDamage(){
        Hp-=1;
    }

    public void TakeDamage(int amount){
        Hp-=amount;
    }

    public void checkHp(){
        if(Hp<=0){
            isDead=true;
        }
    }
    public Boolean getDead() {
        return isDead;
    }


}
