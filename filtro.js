document.querySelectorAll('.filtro-item').forEach(checkbox => {
  checkbox.addEventListener('change', () => {
    const ativos = Array.from(document.querySelectorAll('.filtro-item'))
      .filter(cb => cb.checked)
      .map(cb => cb.dataset.classe);

    document.querySelectorAll('.image-link').forEach(item => {
      const itemClasse = Array.from(item.classList).find(c => ativos.includes(c));
      item.style.display = itemClasse ? '' : 'none';
    });
  });
});