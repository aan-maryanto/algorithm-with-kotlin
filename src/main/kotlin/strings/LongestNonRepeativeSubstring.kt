package strings

fun lengthOfLongestSubstring(s: String) : Int {
    var max : Int = 0
    var start: Int = 0
    var i : Int = 0

    var map = hashMapOf<Char, Int>()

    while (i < s.length) {
        var temp = s[i]

        //adding key to map if not present
        if(!map.containsKey(temp)) map.put(temp, 0)
        //checking if the first value is the duplicate value
        else if(s[i - 1] == temp){
            if (max < map.size) max = map.size
            map = hashMapOf()
            start = i
            i--
        }
        //last possible where duplicate value can be is between start and i
        else{
            if (max < map.size) max = map.size
            while (s[start] != temp) {
                map.remove(s[start])
                start++
            }
            start++
        }
        i++
    }
    if (max < map.size) max = map.size
    return max
}