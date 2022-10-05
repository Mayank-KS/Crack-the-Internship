/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    var p=1;
    var s=0;
    while(n!==0)
    {
        var temp=n%10;
        p*=temp;
        s+=temp;
        n=Math.floor(n/10);
    }
    return p-s;
};