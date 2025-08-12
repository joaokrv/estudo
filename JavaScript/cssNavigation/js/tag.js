const colors = {
  p: "#018075ff",
  div: "#1565c0",
  span: "#d32f2f",
  header: "#455a64",
  ul: "#704700ff",
  ol: "#ffa000",
  section: "#009e1aff",
  nav: "#512da8",
  main: "#f5f5f5",
  footer: "#455a64",
  form: "#7b1fa2",
  body: "#707070ff",
  padrao: "#616161",

  get(tag) {
    return this[tag] ? this[tag] : this.padrao;
  },
};

document.querySelectorAll(".tag").forEach((elemento) => {
  const tagName = elemento.tagName.toLowerCase();

  elemento.style.borderColor = colors.get(tagName);

  if (!elemento.classList.contains("nolabel")) {
    const label = document.createElement("label");
    label.style.backgroundColor = colors.get(tagName);
    label.innerHTML = tagName;
    elemento.insertBefore(label, elemento.childNodes[0]);
  }
});
