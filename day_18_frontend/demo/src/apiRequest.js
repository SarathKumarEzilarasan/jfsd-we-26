const apiRequest = async (url, options = null) => {
  let response = null;
  try {
    response = await fetch(url, options);
    if (!response.ok) throw new Error("Data not found");
    return await response.json();
  } catch (error) {
    return error.message;
  }
};

export default apiRequest;
