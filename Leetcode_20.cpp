class Leetcode_20
{
    public:
    bool isValid(string s) 
    {
        stack<char>s1;
        char c;
        for(int i=0;i<s.length();i++)
        {
            c=s[i];
            if(c=='['||c=='('||c=='{')
            {
                s1.push(c);
            }
            else
            {
                if(!s1.empty())
                {
                    if(s[i]=='}')
                    {
                        if(s1.top()=='{')
                        {
                            s1.pop();
                        }
                        else
                        {
                            return false;
                        }
                    }
                    if(s[i]==']')
                    {
                        if(s1.top()=='[')
                        {
                            s1.pop();
                        }
                        else
                        {
                            return false;
                        }
                    }
                    if(s[i]==')')
                    {
                        if(s1.top()=='(')
                        {
                            s1.pop();
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(s1.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};

/*class Solution {
public:
    bool isValid(string s) {
        int n=s.length();
        stack<char> st;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='(' || s[i]=='[' || s[i]=='{')
            {
                st.push(s[i]);
            }
            else
            {
                if(st.empty() ||
                    (s[i]==')' && st.top()!='(') ||
                    (s[i]==']' && st.top()!='[') ||
                    (s[i]=='}' && st.top()!='{'))
                    {
                        return false;
                    }
                    else
                    {
                        st.pop();
                    }
            }
        }
        return st.empty();
    }
};*/