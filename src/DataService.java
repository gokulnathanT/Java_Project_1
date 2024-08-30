import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataService {
    List<Data>data=new ArrayList<>();

    public void addProduct(Data p) {
      data.add(p);
    }

    public List<Data> getProduct() {
        return data;
    }

    public Data getProductById(int id) {
        for(Data x:data){
            if(x.getId()==id){
                return x;
            }
        }
        return null;
    }

    public List<Data> getTopThree() {
        List<Data> topthree=new ArrayList<>();
        for(Data q:data){
            if(q.getRank()<=3){
                topthree.add(q);
            }
        }
        return topthree;
    }

    public List<Data> getProductByText(String keyword) {
        String Keyword=keyword.toLowerCase();
        List<Data> searched=new ArrayList<>();
        for(Data e:data){
            if(e.getPlace().toLowerCase().contains(Keyword)||e.getName().toLowerCase().contains(Keyword)){
                searched.add(e);
            }
        }
        return searched;
    }


    public void deleteById(int id){
        Iterator<Data>iterator=data.iterator();
        while(iterator.hasNext()){
            Data e=iterator.next();
            if(e.getId()==id){
                iterator.remove();
                break;
            }
        }

    }

    public void updateRank(int id, int rank) {
        Iterator<Data>iterator=data.iterator();
        while(iterator.hasNext()){
            Data e=iterator.next();
            if(e.getId()==id){
                e.setRank(rank);
                break;
            }
        }
    }
    public void updateName(String str, String strnew) {
        Iterator<Data>iterator=data.iterator();
        while(iterator.hasNext()){
            Data e=iterator.next();
            if(e.getName().equals(str)){
                e.setName(strnew);
            }
        }
    }
}
