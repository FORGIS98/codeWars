"use strict";

import { WriteStream, createWriteStream } from "fs";
process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString: string = "";
let inputLines: string[] = [];
let currentLine: number = 0;

process.stdin.on("data", function (inputStdin: string): void {
  inputString += inputStdin;
});

process.stdin.on("end", function (): void {
  inputLines = inputString.split("\n");
  inputString = "";

  main();
});

function readLine(): string {
  return inputLines[currentLine++];
}

/*
 * Complete the 'isBalanced' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

/*
  Solution.ts(41,23): error TS2494: Using a string in a 'for...of' statement is only supported in ECMAScript 5 and higher.
*/

function isBalanced(s: string): string {
  let fake_stack: string[] = [];
  let dic: { [key: string]: string } = {
    "}": "{",
    "]": "[",
    ")": "(",
  };

  for (let bracketIndex: number = 0; bracketIndex < s.length; bracketIndex++) {
    if ("{[(".includes(s[bracketIndex])) {
      fake_stack.push(s[bracketIndex]);
    } else if (
      fake_stack.length != 0 &&
      fake_stack[fake_stack.length - 1] === dic[s[bracketIndex]]
    ) {
      fake_stack.pop();
    } else {
      return "NO";
    }
  }

  return fake_stack.length != 0 ? "NO" : "YES";
}

function main() {
  const ws: WriteStream = createWriteStream(process.env["OUTPUT_PATH"]);

  const t: number = parseInt(readLine().trim(), 10);

  for (let tItr: number = 0; tItr < t; tItr++) {
    const s: string = readLine();
    const result: string = isBalanced(s);
    ws.write(result + "\n");
  }

  ws.end();
}
