function sc(obj){
  
  if (obj instanceof Array) {
    for (let i = 0; i < obj.length / 2; i++) 
      if (obj[i] !== obj[obj.length-i-1]) 
        return false;
    return true;
  }
  
  obj = obj + "";
  for (let i = 0; i < obj.length / 2; i++) {
    if (obj[i] !== obj[obj.length-i-1]) 
      return false;
  }
  
  return true;
}
