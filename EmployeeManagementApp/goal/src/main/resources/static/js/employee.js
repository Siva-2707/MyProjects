//Education Background row actions

function onClickEduBgrndBtn() {
  let btn = document.querySelector("#eduBgrndBtn");
  let eduBgrndRow = document.querySelector(".edu-bgrnd-row");
  eduBgrndRow.insertAdjacentElement("afterend", eduBgrndRow);
}
