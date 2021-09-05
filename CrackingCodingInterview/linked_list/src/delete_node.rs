use std::collections::LinkedList;

fn delete_node<T>(node: usize, list: &mut LinkedList<T>) {
    let mut split = list.split_off(node);
    split.pop_front();
    list.append(&mut split);
}