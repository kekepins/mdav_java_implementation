# MDAV java implementation
MDAV(Maximum Distance to Average Vector) clustering implementation in java

Algo used in anonymisation to compute clusters for micro aggregation

**Algo**
1. Compute the average record of all records, find most distant record from average (xr)
2. Find most distant record xs from xr
3. Compute 2 clusters around xr and xs (closest points)
4. if there is more than 3k records, repeat 1.
5. if there is between 3k-1 2k records, compute average

   5.1. find most distant xr from average
   
   5.2. compute a cluster arround xr
   
6. remaining points are the last cluster
