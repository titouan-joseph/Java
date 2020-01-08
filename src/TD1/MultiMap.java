package TD1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap<K, V> implements Map<K, List<V>> {

    public void putOneValue(K akey, V avalue){
        List<V> rlst;
        if( containsKey(akey)){
            rlst = get(akey);
        }else {
            rlst = new ArrayList<V>();
        }
        rlst.add(avalue);
        put(akey, rlst);
    }

    public boolean containsOneValue(V){
        for( Map.Entry)
    }

}
