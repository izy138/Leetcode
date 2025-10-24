class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        if len(s) != len(t): #check length
            return False

        countS, countT = {}, {} # create hashmap

        for i in range(len(s)): #find freq for each char in both
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)
        return countS == countT

        # for c in countS:
        #     if countS[c] != countT.get(c,0):
        #         return False
        # return True
        