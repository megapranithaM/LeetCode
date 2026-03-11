class MyStack:
    def __init__(self):
        self.s = []

    def push(self, x):
        self.s.append(x)

    def pop(self):
        return self.s.pop()

    def top(self):
        return self.s[-1]

    def empty(self):
        return not self.s


# LeetCode usually calls a function like this:
def run_operations(operations, arguments):
    stack = None
    output = []
    for op, arg in zip(operations, arguments):
        if op == "MyStack":
            stack = MyStack()
            output.append(None)  # null in LeetCode
        elif op == "push":
            stack.push(arg[0])  # arguments are lists
            output.append(None)
        elif op == "pop":
            output.append(stack.pop())
        elif op == "top":
            output.append(stack.top())
        elif op == "empty":
            output.append(stack.empty())
    return output


# Example usage (LeetCode will provide these lists):
operations = ["MyStack","push","push","top","pop","empty"]
arguments  = [[],[1],[2],[],[],[]]

print(run_operations(operations, arguments))
# Output: [None, None, None, 2, 2, False]