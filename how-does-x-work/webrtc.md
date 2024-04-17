## How does webrtc work

- webRTC is a set of javascript apis which allows to establish connection between browsers
- once the connection is established, data can be transmitted directly from browser to browser without touching the server
- with websockets, we can also establish connection between peers and send real time data
- but, with websockets, we will need a client-server model to transmit data, which will add latency
- websockets use tcp connection, whereas webrtc uses udp(user datagram protocol) which is faster
- so why dont we use JUST webRTC?
- because, webRTC use udp, which is not reliable because ther emight be packet loss, ergo, data loss
- also, webRTC doesnt have signalling built in, once the connection is established, we can use webRTC but for the connection to be established, we use websockets
- so how does this connection get established?
- peer 1 offers some data, including information about its network and how to connect to it
- peer 2 then accepts this information
- but what "information" gets sent?
- at first, we need to learn the 'how'
- since the two peers do not know each other, we will have a way to bring them in a channel together using websockets
- once we bring them under the same channel ,the data transmits in the form of SDP(session description protocol) and ICE candidates
- SDP contains codec, address,mediatype etc.
- one sdp will be sdp offer, and another will be sdp answer
- an ice candidate will be a public ip address and a port, usually denoting an address, a user may have multiple ice candidates created by requesting sa stun server
- heres how things play out:

1. Two peers will exchange sdps by some signalling method, but even if they are connected, they cannot transmit any data yet
2. Because in moder days, the ip addresses are hidden behind firewall and NAT devices.
3. So in the background once the sdp offer is established each peer will send a series of requests to the STUN servers which will generate a list of ICE candidates
4. Then they will exchange these ICE candidates information with each other
5. When these candidates are exchanged and an optimal path is discovered data can begin to flow between the two peers.
