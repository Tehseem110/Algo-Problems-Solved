const string = 'the sky is blue';

const reverseWord = (str) => {
  const wordArray = [];

  let oneStr = '';
  for (let i = 0; i < str.length; i++) {
    if (str[i] === ' ' && oneStr) {
      wordArray.unshift(oneStr);
      oneStr = '';
      continue;
    }

    if (str[i] === ' ') {
      if (oneStr) {
        wordArray.unshift(oneStr);
        oneStr = '';
      }
      continue;
    }

    if (str[i] !== ' ') {
      oneStr += str[i];
      if (i === str.length - 1 && oneStr) {
        wordArray.unshift(oneStr);
        oneStr = '';
        continue;
      }
      continue;
    }
  }

  return wordArray.join(' ');
};

console.log(reverseWord(string));
