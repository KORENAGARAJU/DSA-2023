/*package HashMap.ImplementationOfHashMap;
import java.util.* ;
public class HashMapUsingLL {
    static class HashMap<K , V >{
        private class Node{
            K key ;
            V val ;
            Node(K key , V val){
                this.key = key ;
                this.val = val ;
            }
        }
        private int n ; //total numbers of nodes
        private int N ; //total number of buckets ;
        private LinkedList<Node> bucket[] ;
        @SuppressWarnings("uncheck")
        public HashMap(){
            this.N = 4 ;
            this.bucket = new LinkedList[N] ;
            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>() ;
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode() ;
            return  Math.abs(bi)%N ;
        }
        private int searchFromBucket(K key , int bi){

        }
        public void put(K key , V value){
            int bucketIndex = hashFunction(key) ;
            int dataIndex = searchFromBucket(key , bucketIndex) ;
            if(dataIndex == -1){ //no key exist
                bucket[bucketIndex].add(new Node(key , value)) ;
                n++ ;
            }
            else{ // key is already exist ;
                Node data = bucket[bucketIndex].get(dataIndex) ;
                data.val = value ;
            }

            double lambda = (double) n/N ;
            if(lambda > 2.0){
                //rehashing
            }
        }


    }
}
*/
