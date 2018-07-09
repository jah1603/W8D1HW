import db.DBGolfer;
import models.Golfer;

import java.sql.SQLOutput;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Donald", "Trump", 70);
        DBGolfer.save(golfer1);

        List<Golfer> golfers = DBGolfer.getAll();

        Golfer donald = DBGolfer.find(golfer1.getId());
        Golfer trump = DBGolfer.find(golfer1.getFirstName());

        System.out.println(donald.getFirstName());
        System.out.println(trump.getAge());

        System.exit(0);
    }
}
