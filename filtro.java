document.addEventListener("DOMContentLoaded", function () {
  const checkboxes = document.querySelectorAll(".filtro-item");
  const blocos = document.querySelectorAll(".image-link");

  checkboxes.forEach(checkbox => {
    checkbox.addEventListener("change", () => {
      const filtrosAtivos = Array.from(checkboxes)
        .filter(cb => cb.checked)
        .map(cb => cb.getAttribute("data-classe"));

      blocos.forEach(bloco => {
        const visivel = filtrosAtivos.some(filtro =>
          bloco.classList.contains(filtro)
        );
        bloco.style.display = visivel ? "block" : "none";
      });
    });
  });
});