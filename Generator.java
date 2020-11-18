import java.util.Random;

public class Generator 
{
    static Random rand = new Random();
    static Item item = new Item();

    public static int randomBetween(int num1, int num2)
    {
        int disparity = num2 - num1 + 1;
        return rand.nextInt(disparity) + num1;
    }

    public static void randomLoot() {
        int randomInt = rand.nextInt(100);

        if(randomInt == 0)
        {
        item.FlameSwordofSadness();
        }
        
        // -Legendary
        if(randomInt >= 0 & randomInt <= 4)
        {
        item.TheComicallyLargeSpoon();
        }

        //-Legenday
        if(randomInt >= 5 & randomInt <= 10)
        {
        item.EnergySword();
        }

        //-Legenday
        if(randomInt >= 11 & randomInt <= 15)
        {
        item.ACTOFVIOLENCE();
        }

        //-Legenday
        if(randomInt >= 16 & randomInt <= 20)
        {
        item.RubberChicken();
        }

        //-Legenday
        if(randomInt >= 16 & randomInt <= 20)
        {
        item.HashSlingingSlashSingingSpatula();
        }

        //-Legenday
        if(randomInt >= 21 & randomInt <= 25)
        {
        item.UnnaturallyBigNerfSword();
        }

        //-Common
        if(randomInt >= 26 & randomInt <= 50)
        {
        item.GrindersPickAxe();
        }

        //-Common
        if(randomInt >= 51 & randomInt <= 75)
        {
        item.FishSword();
        }

        //-Common
        if(randomInt >= 76 & randomInt <= 100)
        {
        item.LightningFishingRod();
        }
    }
}
