struct MyStack {
    data: Vec<i32>,
    min: i32,
}

impl MyStack {
    fn new(start: Vec<i32>) -> MyStack {
        let mut stack = MyStack {
            data: start,
            min: i32::MAX,
        };
        stack.min = stack.new_min();
        stack
    }

    fn pop(&mut self) -> i32 {
        match self.data.pop() {
            None => panic!("stack is empty"),
            Some(data) => {
                if data == self.min {
                    self.min = self.new_min();
                }
                data
            }
        }
    }

    fn push(&mut self, item: i32) {
        if self.min > item {
            self.min = item
        }
        self.data.push(item);
    }

    fn min(&self) -> i32 {
        self.min
    }

    fn new_min(&self) -> i32 {
        let mut min = i32::MAX;
        for i in self.data.iter() {
            if *i <= min {
                min = *i;
            }
        }
        min
    }
}
