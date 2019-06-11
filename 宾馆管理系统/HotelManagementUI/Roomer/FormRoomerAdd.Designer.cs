namespace HotelManagementUI.Roomer
{
    partial class FormRoomerAdd
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormRoomerAdd));
            this.button3_close = new System.Windows.Forms.Button();
            this.button2_clr = new System.Windows.Forms.Button();
            this.button1_add = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.textBoxAddress = new System.Windows.Forms.TextBox();
            this.textBoxIDCard = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.textBox3_remark = new System.Windows.Forms.TextBox();
            this.textBoxPhone = new System.Windows.Forms.TextBox();
            this.textBoxName = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // button3_close
            // 
            this.button3_close.Location = new System.Drawing.Point(304, 315);
            this.button3_close.Name = "button3_close";
            this.button3_close.Size = new System.Drawing.Size(75, 23);
            this.button3_close.TabIndex = 11;
            this.button3_close.Text = "退出(&Q)";
            this.button3_close.UseVisualStyleBackColor = true;
            this.button3_close.Click += new System.EventHandler(this.button3_close_Click);
            // 
            // button2_clr
            // 
            this.button2_clr.Location = new System.Drawing.Point(203, 315);
            this.button2_clr.Name = "button2_clr";
            this.button2_clr.Size = new System.Drawing.Size(75, 23);
            this.button2_clr.TabIndex = 10;
            this.button2_clr.Text = "清除(&C)";
            this.button2_clr.UseVisualStyleBackColor = true;
            this.button2_clr.Click += new System.EventHandler(this.button2_clr_Click);
            // 
            // button1_add
            // 
            this.button1_add.Location = new System.Drawing.Point(73, 315);
            this.button1_add.Name = "button1_add";
            this.button1_add.Size = new System.Drawing.Size(75, 23);
            this.button1_add.TabIndex = 9;
            this.button1_add.Text = "增加(&A)";
            this.button1_add.UseVisualStyleBackColor = true;
            this.button1_add.Click += new System.EventHandler(this.button1_add_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.textBoxAddress);
            this.groupBox1.Controls.Add(this.textBoxIDCard);
            this.groupBox1.Controls.Add(this.label5);
            this.groupBox1.Controls.Add(this.textBox3_remark);
            this.groupBox1.Controls.Add(this.textBoxPhone);
            this.groupBox1.Controls.Add(this.textBoxName);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Location = new System.Drawing.Point(43, 23);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(373, 265);
            this.groupBox1.TabIndex = 8;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "住客信息";
            // 
            // textBoxAddress
            // 
            this.textBoxAddress.Location = new System.Drawing.Point(131, 114);
            this.textBoxAddress.Name = "textBoxAddress";
            this.textBoxAddress.Size = new System.Drawing.Size(100, 21);
            this.textBoxAddress.TabIndex = 10;
            // 
            // textBoxIDCard
            // 
            this.textBoxIDCard.Location = new System.Drawing.Point(131, 21);
            this.textBoxIDCard.Name = "textBoxIDCard";
            this.textBoxIDCard.Size = new System.Drawing.Size(205, 21);
            this.textBoxIDCard.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(28, 26);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(65, 12);
            this.label5.TabIndex = 8;
            this.label5.Text = "身份证号：";
            // 
            // textBox3_remark
            // 
            this.textBox3_remark.Location = new System.Drawing.Point(131, 155);
            this.textBox3_remark.Multiline = true;
            this.textBox3_remark.Name = "textBox3_remark";
            this.textBox3_remark.Size = new System.Drawing.Size(205, 86);
            this.textBox3_remark.TabIndex = 7;
            // 
            // textBoxPhone
            // 
            this.textBoxPhone.Location = new System.Drawing.Point(131, 78);
            this.textBoxPhone.Name = "textBoxPhone";
            this.textBoxPhone.Size = new System.Drawing.Size(121, 21);
            this.textBoxPhone.TabIndex = 5;
            this.textBoxPhone.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBoxPhone_KeyPress);
            // 
            // textBoxName
            // 
            this.textBoxName.Location = new System.Drawing.Point(131, 48);
            this.textBoxName.Name = "textBoxName";
            this.textBoxName.Size = new System.Drawing.Size(121, 21);
            this.textBoxName.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(28, 57);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "姓名：";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(28, 158);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(41, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "备注：";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(28, 81);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "电话：";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(28, 114);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "住址：";
            // 
            // FormRoomerAdd
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.AliceBlue;
            this.ClientSize = new System.Drawing.Size(459, 361);
            this.Controls.Add(this.button3_close);
            this.Controls.Add(this.button2_clr);
            this.Controls.Add(this.button1_add);
            this.Controls.Add(this.groupBox1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "FormRoomerAdd";
            this.Text = "住客信息录入";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button button3_close;
        private System.Windows.Forms.Button button2_clr;
        private System.Windows.Forms.Button button1_add;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox textBox3_remark;
        private System.Windows.Forms.TextBox textBoxPhone;
        private System.Windows.Forms.TextBox textBoxName;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox textBoxIDCard;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textBoxAddress;

    }
}