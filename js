function returnSpecifics(obj){
  
  let a = [], b = [];
  
  for (let [key, value] of Object.entries(obj)) {
    
    if (typeof value === 'number')        a.push(value);
    else if (typeof value === 'function') b.push(key);

  }
  
  for (let el of b) a.push(el);
  
  return a.length !== 0 ? a : ['The Object is Empty'];
}
