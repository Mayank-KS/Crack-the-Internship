/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    const arr = [];
    
    nums.forEach(num => {
        if(arr.includes(num)) {
            arr.splice(arr.indexOf(num), 1)
        } else {
            arr.push(num)
        }
        
    })
    
    return arr[0]
};