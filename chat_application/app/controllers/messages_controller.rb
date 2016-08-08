class MessagesController < ApplicationController
	respond_to :html, :js

  def index
    @messages = Message.all
  end

  def create
    @message = Message.new(params[:message])
  	respond_to do |format|
      if @message.save
        content = Message.last(10).collect(&:content).join(" ")
        File.open("/home/littlecegian/Downloads/mallet/TestFile.txt", 'w') { |file| file.write(content) }
      	format.js
      end
    end
  end
end