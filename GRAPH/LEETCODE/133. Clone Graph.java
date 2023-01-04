class Solution {
    public Node Dfs(Node copy[],Node node)
    {
        if(copy[node.val]!=null)
        {
            return copy[node.val];
        }
        copy[node.val]=new Node(node.val);
        for(Node adj:node.neighbors)
        {
           copy[node.val].neighbors.add(Dfs(copy,adj));

        }
        return copy[node.val];
    }
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Node copy[]=new Node[101];
        Dfs(copy,node);
        return Dfs(copy,node);

    }
}
