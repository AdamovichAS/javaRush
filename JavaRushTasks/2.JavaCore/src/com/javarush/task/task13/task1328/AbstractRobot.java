package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable,Defensable {
    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {

            attackedBodyPart = BodyPart.LEG;
        }else if(hitCount ==4){
            attackedBodyPart = BodyPart.CHEST;
            hitCount =0;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        hitCount = hitCount + 1;

        BodyPart defendedBodyPart = null;
        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {

            defendedBodyPart = BodyPart.ARM;
        }else if(hitCount ==4){
            defendedBodyPart = BodyPart.CHEST;
            hitCount = hitCount-3;
        }
        return defendedBodyPart;
    }
}
