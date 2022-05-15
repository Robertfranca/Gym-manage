const button= document.getElementById('button')

button.addEventListener('click', (event) => {
    event.preventDefault()

    const email= document.getElementById('email')
    const password= document.getElementById('password')
    const cpf= document.getElementById('cpf')
    const phone= document.getElementById('phone')

    if(password.value == ''){
        password.classList.add("erroInput")
    }else{
        password.classList.remove("erroInput") 
    }

    if(email.value == ''){
        email.classList.add("erroInput")
    }else{
        email.classList.remove("erroInput")
    }

    if(cpf.value == '' ){
        cpf.classList.add("erroInput")
    }else{
        cpf.classList.remove("erroInput")
    }

    if(phone.value == '' ){
        phone.classList.add("erroInput")
    }else{
        phone.classList.remove("erroInput")
    }




    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 || (email.value.indexOf('.') - email.value.indexOf('@') == 1)){
        email.classList.add("erroInput")
    }
    
    function isValidCPF(cpf) {
        if (typeof cpf !== 'string') return false
        cpf = cpf.replace(/[^\d]+/g, '')
        if (cpf.length !== 11 || !!cpf.match(/(\d)\1{10}/)) return false
        cpf = cpf.split('').map(el => +el)
        const rest = (count) => (cpf.slice(0, count-12)
            .reduce( (soma, el, index) => (soma + el * (count-index)), 0 )*10) % 11 % 10
        return rest(10) === cpf[9] && rest(11) === cpf[10]
    }


})

function mascara_cpf() {
    var cpf = document.getElementById('cpf')
    if (cpf.value.length == 3 || cpf.value.length == 7) {
        cpf.value += "."
    } else if (cpf.value.length == 11) {
        cpf.value += "-"
    }
}

function mask(o, f) {
    setTimeout(function() {
      var v = mphone(o.value);
      if (v != o.value) {
        o.value = v;
      }
    }, 1);
  }
  
  function mphone(v) {
    var r = v.replace(/\D/g, "");
    r = r.replace(/^0/, "");
    if (r.length > 10) {
      r = r.replace(/^(\d\d)(\d{5})(\d{4}).*/, "($1) $2-$3");
    } else if (r.length > 5) {
      r = r.replace(/^(\d\d)(\d{4})(\d{0,4}).*/, "($1) $2-$3");
    } else if (r.length > 2) {
      r = r.replace(/^(\d\d)(\d{0,5})/, "($1) $2");
    } else {
      r = r.replace(/^(\d*)/, "($1");
    }
    return r;
  }