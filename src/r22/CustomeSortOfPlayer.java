package r22;

import java.util.*;

public class CustomeSortOfPlayer {
    public static void main(String[] args) {
        List<Player> playerList=new ArrayList<>();
        playerList.add(new Player(1,"p1",3000));
        playerList.add(new Player(5,"p3",2000));
        playerList.add(new Player(4,"p4",5000));
        playerList.add(new Player(2,"p2",1000));
        System.out.println("before Sorting List");
        for(Player p:playerList)
        {
            System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
        }
        Comparator<Player> pid=new SortPlayerById();
        Collections.sort(playerList,pid);
        System.out.println("after sorting by Id");
        for(Player p:playerList)
        {
            System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
        }

        Comparator<Player> prun=new SortPlayerByRun();
        Collections.sort(playerList,prun);
        System.out.println("after sorting by Run");
        for(Player p:playerList)
        {
            System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
        }
        System.out.println("sorting by name");
        Collections.sort(playerList,(Player p1,Player p2)->p1.getName().compareTo(p2.getName()));
        for(Player p:playerList)
        {
            System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
        }

    }
}

class Player
{
    int id;
    String name;
    int run;

    public Player(int id, String name, int run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }
}
class SortPlayerById implements Comparator<Player>
{


    @Override
    public int compare(Player o1, Player o2) {
        return o1.getId()>o2.getId()?1:o1.getId()<o2.getId()?-1:0;
    }
}

class SortPlayerByRun implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getRun()>o2.getRun()?1:o1.getRun()<o2.getRun()?-1:0;
    }
}

class SortPlayerByNmae implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
