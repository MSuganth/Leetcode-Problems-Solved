/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
     var res = [];
     let i=0;
     while(i<nums.length){
         res.push(nums[i]);
         i++;
     }
     i = 0;
     while(i<nums.length){
         res.push(nums[i]);
         i++;
     }
     return res;
};