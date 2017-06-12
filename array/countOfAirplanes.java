// I will provide two solutions here

// Solution 1
public int countOfAirplanes(List<Interval> airplanes){
    if(airplanes == null || airplanes.size() == 0) return 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int max = 0;
    for(Interval interval : airplanes){
        for(int i = interval.start; i < interval.end; i++){
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else 
                map.put(i, 1);
            max = Math.max(map.get(i), max);
        }
    }
    
    return max;
}

// Solution 2
public int countOfAirplanes(List<Interval> airplanes){
    if(airplanes == null || airplanes.size() == 0) return 0;
    Point[] points = new Point[airplanes.size() * 2];
    
    for(int i = 0, j = 0; i < airplanes.size(); i++){
        points[j++] = new Point(airplanes.get(i).start, 1);
        points[j++] = new Point(airplanes.get(i).end, 0);
    }
    Arrays.sort(points);
    int count = 0, result = 0;
    for(int i = 0; i < points.length; i++){
        if(points[i].flag == 1)
            count++;
        else
            count--;
        result = Math.max(result. count);
    }
    
    return result;
}

class Point implements Comparable<Point>{
    public int time;
    pblic int flag;
    public Point(int time, int flag){
        this.time =time;
        this.flag = flag;
    }
    
    public int compareTo(Point point){
        if(time = point.time)
            return this.flag - point.flag;
        else
            return this.time - point.time;
    }
}
