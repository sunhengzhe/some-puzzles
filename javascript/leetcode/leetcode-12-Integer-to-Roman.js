const intToRomanMapList = [
  {
      symbol: 'I',
      value: 1
  },
  {
      symbol: 'IV',
      value: 4
  },
  {
      symbol: 'V',
      value: 5
  },
  {
      symbol: 'IX',
      value: 9
  },
  {
      symbol: 'X',
      value: 10
  },
  {
      symbol: 'XL',
      value: 40
  },
  {
      symbol: 'L',
      value: 50
  },
  {
      symbol: 'XC',
      value: 90
  },
  {
      symbol: 'C',
      value: 100
  },
  {
      symbol: 'CD',
      value: 400
  },
  {
      symbol: 'D',
      value: 500
  },
  {
      symbol: 'CM',
      value: 900
  },
  {
      symbol: 'M',
      value: 1000
  }
]

/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
  const resultMap = intToRomanMapList
      .reduceRight((accumulator, intToRomanMap) => {
          const { symbol, value } = intToRomanMap
          let { result, remaining } = accumulator

          const count = remaining / value | 0
          remaining = remaining % value
          result += symbol.repeat(count)

          return {
              result,
              remaining
          }
      }, {
          result: '',
          remaining: num
      })

  return resultMap.result
};

module.exports = intToRoman;