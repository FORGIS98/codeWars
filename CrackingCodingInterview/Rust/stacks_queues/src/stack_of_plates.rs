use std::collections::VecDeque;

struct MyStack<T> {
    stacks: Vec<VecDeque<T>>,
    max_stack_size: u32,
}

impl<T> MyStack<T> {
    fn new(max: u32) -> MyStack<T> {
        MyStack {
            stacks: vec![VecDeque::new()],
            max_stack_size: max,
        }
    }

    fn pop(&mut self) -> Result<T, &str> {
        loop {
            if self.stacks.len() == 0 {
                return Err("stack is empty");
            }

            match self.stacks.pop() {
                None => panic!("weird error - stack is empty"),
                Some(mut vec_deque) => {
                    if vec_deque.len() == 0 {
                        continue;
                    } else {
                        match vec_deque.pop_back() {
                            None => panic!("weird error - stack is empty"),
                            Some(value) => {
                                self.stacks.push(vec_deque);
                                return Ok(value);
                            }
                        }
                    }
                }
            }
        }
    }

    fn push(&mut self, item: T) -> Result<(), &str> {
        if self.stacks.len() == 0 {
            let mut vec_deque = VecDeque::new();
            vec_deque.push_back(item);
            self.stacks.push(vec_deque);
            return Ok(());
        }

        match self.stacks.pop() {
            None => panic!("weird error - stack is empty"),
            Some(mut vec_deque) => {
                if vec_deque.len() == self.max_stack_size as usize {
                    // First we push the "full" VecDeque back to the Vector
                    self.stacks.push(vec_deque);
                    // We creata a new VecDeque to continue adding elements
                    let mut vec_deque = VecDeque::new();
                    vec_deque.push_back(item);
                    // We push the new VecDeque just after the previous full one
                    self.stacks.push(vec_deque);
                } else {
                    vec_deque.push_back(item);
                    self.stacks.push(vec_deque);
                }
                return Ok(());
            }
        }
    }
}