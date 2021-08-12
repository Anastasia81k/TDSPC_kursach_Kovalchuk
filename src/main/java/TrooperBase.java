import java.util.LinkedList;

public class TrooperBase {


    LinkedList<Trooper> troopers = new LinkedList<Trooper>();

    public TrooperBase(LinkedList<Trooper> troopers) {
        this.troopers = troopers;
    }

    public TrooperBase() {
    }

    public void addTrooper(Trooper tr) {

        troopers.add(tr);

    }

    public void removeTrooper() {

        troopers.removeFirst();
    }

    public Trooper getTrooper() {

        return troopers.peek();

    }

    public int getNumberofTroopersInBase() {

        return troopers.size();
    }

    public Trooper pollTrooper() {

        return troopers.poll();

    }

    public LinkedList<Trooper> getTroopers() {
        return troopers;
    }

    public void setTroopers(LinkedList<Trooper> troopers) {
        this.troopers = troopers;
    }
}