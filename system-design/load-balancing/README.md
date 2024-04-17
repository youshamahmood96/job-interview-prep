See [this article from sam rose](https://samwho.dev/load-balancing/)

## Proxies and Load-balancing

### Forward proxy

Proxy server hides user info from the server.
For example I cannot directly go to the origin server, i can access the origin server and then the proxy can access the origin server.

VPN is an example of forward proxy

### Reverse proxy

Hides the origin server identity.

CDN is a reverse proxy. Because user interacts with the nearest CDN, and that nearest CDN communicates with the origin server which the user may not know about.

### Load Balancing

A Load Balancer is a reverse proxy.

User makes request to the load balancer, and there are multiple origin servers.
Load balancer distributes the traffic equally.

**Algorithms used for load-balancing:**

#### Round Robin

Send in request to each server in turn, very simple

But in reality, it seldom happens that each server will have the same computational power and all the requests will be equally heavy.

- Weighted round robin
- Based on the server that has the least number of active connections
- Based on user location
- Hashing

Layer 4 vs Layer 7 load balancing:
layer 4 is the transport layer, layer 7 is the application layer.
layer 4 is faster, we can just look at the IP directly, but we do not have access to the data. Basicallly we do load balancing based on least number of connections.

Layer 7 has access to data, so we can load balance based on the purpose of data.

We may have multiple replicas of load balancers.

**READ: Maglevs paper.**

## Consistent Hashing

Based on user IP address.
Example: IP = 6, 6%3=0, mapped to server 0.

each IP address holder will always be routed

Components: hashkey(based on ip address),hash function(ex. SHA), Nodes.

**Hashing** involves using a hash function to generate a random number, which then is divided by the numkber of available memory space, and then assigning to that space.

**Consistent hashing** is hashing when done in such a way that it minimizes the number of nodes to be moved if new nodes are added.
